class LRUCache {

    Map<Integer, Integer> map;
    Queue<Integer> cache;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        cache = new LinkedList<>();
    }
    
    public int get(int key) {
        if (map.getOrDefault(key, -1) != -1){
            cache.remove(key);
            cache.offer(key);
        }
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if (map.getOrDefault(key, -1) == -1){
            cache.offer(key);
        } 
        map.put(key, value);
        cache.remove(key);
        cache.offer(key);
        if (cache.size() > capacity){
            int removedKey = cache.poll();
            map.remove(removedKey);
        }
        
    }
}
