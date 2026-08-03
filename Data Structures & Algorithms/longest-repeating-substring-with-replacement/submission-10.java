class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        char[] sArray = s.toCharArray();
        int ans = 0;
        int maxf = 0;
        for (int right = 0; right < sArray.length; right++){
            map.put(sArray[right], map.getOrDefault(sArray[right], 0) + 1);
            if (map.get(sArray[right]) > maxf){
                maxf = map.get(sArray[right]);
            }
            int windowLength = right - left + 1;
            while (windowLength - maxf > k){
                map.put(sArray[left], map.get(sArray[left]) - 1);
                if (map.get(sArray[left]) == 0) map.remove(sArray[left]);
                left++;
                windowLength -= 1;
            }
            ans = Math.max(ans, windowLength);
        }
        return ans;
    }
}
