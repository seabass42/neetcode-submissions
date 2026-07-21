class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        for (String str : operations){
            if (isInteger(str)){
                scores.push(Integer.parseInt(str));
            } else {
                if (str.equals("D")){
                    int op = scores.peek();
                    scores.push(op * 2);
                } else if (str.equals("+")){
                    int op2 = scores.pop();
                    int op1 = scores.peek();
                    scores.push(op2);
                    scores.push(op1 + op2);
                } else {
                    scores.pop();
                }
            }
        }
        int ans = 0;
        while (!scores.isEmpty()){
            ans += scores.pop();
        }
        return ans;
    }

    private boolean isInteger(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}