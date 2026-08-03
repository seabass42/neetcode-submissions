class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        char[] sArray = s.toCharArray();
        int ans = 0;
        char maxChar = ' ';
        for (int right = 0; right < sArray.length; right++){
            map.put(sArray[right], map.getOrDefault(sArray[right], 0) + 1);
            if (map.get(sArray[right]) > map.getOrDefault(maxChar, 0)){
                maxChar = sArray[right];
            }
            int windowLength = right - left + 1;
            while (windowLength - map.getOrDefault(maxChar, 0) > k && left < right){
                System.out.println("max reached at length " + windowLength);
                map.put(sArray[left], map.get(sArray[left]) - 1);
                if (sArray[left] == maxChar){
                    for (Map.Entry<Character, Integer> entry : map.entrySet()){
                        if (entry.getValue() > map.get(maxChar)){
                            maxChar = entry.getKey();
                        }
                    }
                }
                if (map.get(sArray[left]) == 0) map.remove(sArray[left]);
                left++;
                windowLength -= 1;
            }
            ans = Math.max(ans, windowLength);
        }
        return ans;
    }
}
