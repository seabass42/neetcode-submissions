class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;

        Set<Integer> res = new HashSet<>();
        int ans = 1;
        for (int n : nums){
            res.add(n);
        }
        for (int i = 0; i < nums.length; i++){
            if (!res.contains(nums[i] - 1)){
                int length = 1;
                int currNumber = nums[i];
                while (res.contains(currNumber + 1)){
                    length++;
                    currNumber++;
                }
                ans = Math.max(length, ans);
            }
        }
        return ans;
    }
}
