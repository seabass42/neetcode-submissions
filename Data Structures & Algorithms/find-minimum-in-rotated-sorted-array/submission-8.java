class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1; 
        int ans = 1000;
        while (left <= right){
            int mid = left + (right - left) / 2;
            ans = Math.min(nums[mid], ans);
            ans = Math.min(nums[left], ans);
            ans = Math.min(nums[right], ans);
            if (nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
