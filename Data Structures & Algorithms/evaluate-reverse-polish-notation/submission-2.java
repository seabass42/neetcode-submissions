class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (String str : tokens){
            if (isInteger(str)){
                stack.push(Integer.parseInt(str));
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                if (str.equals("+")){
                    stack.push(op1 + op2);
                } else if (str.equals("-")){
                    stack.push(op1 - op2);
                } else if (str.equals("/")){
                    if (op2 == 0){
                        int temp = op2;
                        op2 = op1;
                        op1 = temp;
                    }
                    stack.push(op1 / op2);
                } else if (str.equals("*")){
                    stack.push(op1 * op2);
                }
            }
        }
        return stack.peek();
    }
    
    private boolean isInteger(String str){
        if (str == null || str.isEmpty()) return false;

        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
