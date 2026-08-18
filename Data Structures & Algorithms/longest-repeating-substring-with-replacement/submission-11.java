class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int currMax = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++){
            char currChar = s.charAt(right);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
            if (map.get(currChar) > currMax){
                currMax = map.get(currChar);
            }
            while ((right - left + 1) - currMax > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
