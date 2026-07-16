class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;

        Set<Integer> vals = new HashSet<>();
        for (int num : nums){
            vals.add(num);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int currLength = 1;
            
                while (vals.contains(curr + 1)){
                    currLength++;
                    curr++;
                }
                ans = Math.max(ans, currLength);
            
        }
        return ans;
    }
}
