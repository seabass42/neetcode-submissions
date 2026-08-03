class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Double> road = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        double max = -1;
        for (int i = position.length - 1; i >= 0; i--){
            double toTarget = (double) (target - position[i]) / map.get(position[i]);
            if (toTarget > max){
                road.push(toTarget);
                max = toTarget;
            }
        }
        return road.size();
    }
}
