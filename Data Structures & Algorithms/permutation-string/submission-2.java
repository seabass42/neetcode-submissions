class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1freq = new HashMap<>();
        for (char c : s1.toCharArray()){
            s1freq.put(c, s1freq.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> windowF = new HashMap<>();
        int l = 0;
        for (int r = 0; r < s2.length(); r++){
            char currCar = s2.charAt(r);
            windowF.put(currCar, windowF.getOrDefault(currCar, 0) + 1);
            if (!s1freq.containsKey(currCar)){
                windowF = new HashMap<>();
                l = r + 1;
                continue;
            }
            while(s1freq.getOrDefault(currCar, 0) < windowF.getOrDefault(currCar, 0) && l <= r){
                windowF.put(s2.charAt(l), windowF.get(s2.charAt(l)) - 1);
                l++;
            }

            if (windowF.equals(s1freq)) return true;
        }
        return false; 
    }
}
