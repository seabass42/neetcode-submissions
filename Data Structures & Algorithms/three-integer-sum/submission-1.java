class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[right] + nums[left];
                if (sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int currNum = nums[left];
                    while (left < right && nums[left] == currNum){
                        left++;
                    }
                } else if (sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
