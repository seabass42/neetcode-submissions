class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (char S : s.toCharArray()){
            mapS.put(S, mapS.getOrDefault(S, 0) + 1);
        }
        for (char T : t.toCharArray()){
            mapT.put(T, mapT.getOrDefault(T, 0) + 1);
        }
        return mapT.equals(mapS);
    }
}
