class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i = 0; i < position.length; i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        double targetTime;
        for (int i = 0; i < position.length; i++){
            targetTime = (double) (target - pairs[i][0]) / pairs[i][1];
            if (!stack.isEmpty()){
                Double curr = stack.peek();
                stack.push(targetTime);
                if (targetTime <= curr){stack.pop();}
            } else {
                stack.push(targetTime);
            }
        }
        return stack.size();
    }
}
