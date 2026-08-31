class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> confirmed = new HashSet<>();
        for (int num : nums){
            if (confirmed.contains(num)) continue;

            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 3){
                confirmed.add(num);
                ans.add(num);
            }
        }
        return ans;
    }
}