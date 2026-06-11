class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // Each array must be initialized before being added to
        map.forEach((k, value) -> {
            value = new ArrayList<>();
        });
        
        for (String str : strs){
            int[] abc = new int[26];
            for (char letter : str.toCharArray()){
                abc[letter - 'a']++;

            }
            StringBuilder tempKey = new StringBuilder();
            for (int i = 0; i < abc.length; i++){
                while (abc[i] > 0){
                    tempKey.append('a' + i);
                    abc[i]--;
                }
            }
            String key = tempKey.toString();
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(str);
        }
        List<List<String>> ans = new ArrayList<>();
        map.forEach((k, value) -> {
            ans.add(value);
        });
        return ans;
    }
}
