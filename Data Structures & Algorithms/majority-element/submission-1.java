class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxElement = 0;
        int maxNum = -1000000000;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxNum){
                maxNum = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        return maxElement;
    }
}