class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        char[] sArray = s.toCharArray();
        while (left < right){
            while (left < right && !Character.isLetterOrDigit(sArray[left])){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(sArray[right])){
                right--;
            }
            if (Character.toLowerCase(sArray[left]) != Character.toLowerCase(sArray[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
