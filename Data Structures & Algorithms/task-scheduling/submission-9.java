class Node {
    char c;
    int cycleAt;
    public Node(char c, int cycleAt) {
        this.cycleAt = cycleAt;
        this.c = c;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> taskQueue = new PriorityQueue<>((a, b) -> {
            return map.getOrDefault(b, 0) - map.getOrDefault(a, 0);
        });

        Queue<Node> cooldown = new LinkedList<>();

        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            taskQueue.offer(c);
        }
        System.out.println("size of tasks is " + taskQueue.size());

        int cycles = 0;
        while (!taskQueue.isEmpty() || !cooldown.isEmpty()) {

            if (!cooldown.isEmpty() && cycles > n + cooldown.peek().cycleAt) {
                Node curr = cooldown.poll();
                taskQueue.offer(curr.c);
            } 
            if (!taskQueue.isEmpty()) {
                char newTask = taskQueue.poll();
                map.put(newTask, map.get(newTask) - 1);
                if (map.get(newTask) > 0) {
                    cooldown.offer(new Node(newTask, cycles));
                } 
            }
            cycles++;
        }
        return cycles;

    }
}
