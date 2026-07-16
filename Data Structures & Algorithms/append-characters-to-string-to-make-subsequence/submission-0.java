class Solution {
    public int appendCharacters(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int i = 0;
        int j = 0;
        int charsShared = 0;
        while (i < sArray.length && j < tArray.length){
            while (i < sArray.length && sArray[i] != tArray[j]){
                i++;
            }
            if (i < sArray.length && sArray[i] == tArray[j]){
                i++;
                j++;
                charsShared++;
                continue;
            }
        }
        return tArray.length - charsShared;
    }
}