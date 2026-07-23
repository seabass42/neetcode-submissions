class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < position.length; i++){
            pairs.add(new int[] {position[i], speed[i]});
        }
        pairs.sort((a,b) -> b[0] - a[0]);
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < pairs.size(); i++){
            double targetTime = (double) (target - pairs.get(i)[0]) / pairs.get(i)[1];
            if (stack.isEmpty()){
                stack.push(targetTime);
            } else {
                if (targetTime > stack.peek()){
                    stack.push(targetTime);
                }
            }


        }
        return stack.size();
    }
}
