class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int left = 0, right = heights.length - 1;
        while (left < right){
            int water = (right - left) * Math.min(heights[left], heights[right]);
            ans = Math.max(ans, water);
            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return ans;
    }
}
