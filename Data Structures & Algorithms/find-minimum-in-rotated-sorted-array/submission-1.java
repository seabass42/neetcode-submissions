class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans =  1000;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int numL = nums[left];
            int numR = nums[right];
            ans = Math.min(nums[mid], ans);
            ans = Math.min(numL, ans);
            ans = Math.min(numR, ans);
            if (nums[mid] > numR){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
