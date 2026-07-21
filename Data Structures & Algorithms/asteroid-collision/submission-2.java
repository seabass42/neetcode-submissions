class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids){
            if (stack.isEmpty()){
                stack.push(ast);
                continue;
            }
            boolean exploded = false;
            while (!stack.isEmpty() && !exploded && (stack.peek() > 0 && ast < 0)){
                if (Math.abs(stack.peek()) < Math.abs(ast)){
                    stack.pop();
                } else if (Math.abs(stack.peek()) == Math.abs(ast)){
                    exploded = true;
                    stack.pop();
                }
                 else {
                    exploded = true;
                }
            }
            if (!exploded){
                stack.push(ast);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}