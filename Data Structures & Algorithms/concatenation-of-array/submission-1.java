class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int j = 0;
        for (int i = 0; i < ans.length; i++){
            if (i == nums.length) j = 0;
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
}