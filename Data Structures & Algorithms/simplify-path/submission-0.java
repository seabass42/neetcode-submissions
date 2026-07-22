class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String str : arr){
            if (str.equals(".")) continue;
            if (str.equals("..")){
                if (!stack.isEmpty()) stack.pop();
            } else if (!str.equals("")){
                stack.push(str);
            }
        }
        if (stack.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder();
        for (String str : stack){
            ans.append("/");
            ans.append(str);
        }
        return new String(ans);
    }
}