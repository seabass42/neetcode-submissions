class Solution {
    public int maxSubArray(int[] nums) {

        int left = 0;
        int currSum = nums[0];
        int ans = currSum;

        for (int right = 1; right < nums.length; right++) {
            if (currSum + nums[right] < nums[right]) {
                currSum = nums[right];
                left = right;
                ans = Math.max(currSum, ans);
                continue;
            }
            currSum += nums[right];
            ans = Math.max(currSum, ans);
        }
        return ans;
    }
}
