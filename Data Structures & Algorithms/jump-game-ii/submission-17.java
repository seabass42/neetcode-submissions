class Solution {
    public int jump(int[] nums) {
        int index = 0;
        int ans = 0;
        if (nums.length == 1 && nums[0] > 0) return 0;

        while (index < nums.length && nums[index] > 0) {
            if (nums.length - 1 - index <= nums[index]) {
                return ans + 1;
            }
            int maxJump = 1;
            int maxIndex = index + nums[index];

            for (int i = index + 1; i < nums.length && i <= index + nums[index]; i++) {
                if (maxJump < i - index + nums[i]) {
                    maxJump = i - index + nums[i];
                    maxIndex = i;
                }
            }

            System.out.println("Jumping from " + index + " to " + maxIndex);
            index = maxIndex;
            ans++;
        }
        return ans;
    }
}
