class Solution {
    public int appendCharacters(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < sArray.length && j < tArray.length){
            if (i < sArray.length && sArray[i] == tArray[j]){
                i++;
                j++;
            } else if (i < sArray.length) i++;
        }
        return tArray.length - j;
    }
}