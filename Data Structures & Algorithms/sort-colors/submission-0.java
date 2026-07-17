class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        int currIndex = 0;
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0){
                nums[currIndex] = i;
                currIndex++;
                count[i]--;
            }
        }
    }
}