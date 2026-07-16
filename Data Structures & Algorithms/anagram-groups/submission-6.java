class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> freqs = new HashMap<>();
        for (String str : strs){
            int[] alphabet = new int[26];
            for (char letter : str.toCharArray()){
                alphabet[letter - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < alphabet.length; i++){
                while(alphabet[i] > 0) {
                    key.append(i + 'a');
                    alphabet[i]--;
                }
            }
            String keyS = key.toString();
            if (!freqs.containsKey(keyS)){
                freqs.put(keyS, new ArrayList<String>());
            }
            freqs.get(keyS).add(str);
        }
        freqs.forEach((key, value) -> {
            ans.add(value);
        });
        return ans;
    }
}
