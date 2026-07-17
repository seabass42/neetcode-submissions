class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();

        Set<Character> chars = new HashSet<>();
        char[] sArray = s.toCharArray();
        int ans = 0;
        int left = 0;
        chars.add(sArray[left]);
        for (int right = 1; right < s.length(); right++){
            while (chars.contains(sArray[right])){
                chars.remove(sArray[left]);
                left++;
            }
            chars.add(sArray[right]);
            ans = Math.max(ans, chars.size());
        }
        return ans;
    }
}
