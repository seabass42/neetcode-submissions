class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";
        StringBuilder encoded = new StringBuilder();
        for (String str : strs){
            encoded.append(str.length() + "#" + str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<String>();
        List<String> ans = new ArrayList<>();

        int i = 0;
        char[] arr = str.toCharArray();
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i + length;
            ans.add(str.substring(i, j));
            i = j;
        }
        return ans;
    }
}
