class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if ((numbers[i] + numbers[j]) == target){
                    index1 = i + 1;
                    index2 = j + 1;
                }
            }
        }
        int[] ans = new int[2];
        ans[0] = index1;
        ans[1] = index2;
        return ans;
    }
}
