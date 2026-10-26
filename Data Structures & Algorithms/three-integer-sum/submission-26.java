class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right && left < nums.length) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    int curr = left;
                    left++;
                    while (left < right && nums[left] == nums[curr]) left++;
                } else if (sum < 0) {
                    int curr = left;
                    left++;
                    while (left < right && nums[left] == nums[curr]) left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}
