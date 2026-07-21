class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
       

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && stack.peek() < temperatures[i]){
                int element = stack.pop();
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
            stack.push(temperatures[i]);
        }
        return result;
    }
}
