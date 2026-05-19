class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        for (String str : strs){
            StringBuilder key = new StringBuilder("");
            int[] alphabet = new int[26];
            for (char c : str.toCharArray()){
                alphabet[c - 'a']++;
            }
            for (int i = 0; i < alphabet.length; i++){
                while(alphabet[i] > 0){
                    key.append((char) i + 'a');
                    alphabet[i]--;
                }
            }
            String mapKey = key.toString();
            freq.putIfAbsent(mapKey, new ArrayList<>());
            freq.get(mapKey).add(str); 
        }
        List<List<String>> ans = new ArrayList<>();
        freq.forEach((key, value) -> {
            ans.add(value);
        });
        return new ArrayList<>(freq.values());
    }
}
