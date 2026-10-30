class Solution {
    public boolean canJump(int[] nums) {
        int index = 0;
        if (nums.length == 1) return true;

        while (index < nums.length && nums[index] > 0) {
            if (index + nums[index] >= nums.length - 1) return true;

            int maxJump = 1;
            int maxIndex = index + nums[index];

            for (int i = index + 1; i <= index + nums[index]; i++) {
                if ((i - index + nums[i]) > maxJump) {
                    maxIndex = i;
                    maxJump = i - index + nums[i];
                }
            }
            System.out.println("Jumping from " + index + " to " + maxIndex);
            index = maxIndex;
        }
        return false;
    }
}
