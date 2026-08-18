class Solution {
    int hours;
    public int minEatingSpeed(int[] piles, int h) {
        this.hours = h;
        int max = 1;
        for (int bananas : piles){
            max = Math.max(bananas, max);
        }
        int left = 1;
        int right = max;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (check(piles, mid)){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean check(int[] piles, int val){
        double limit = 0;
        for (double bananas : piles){
            limit += Math.ceil(bananas / val);
        }
        return limit <= hours;
    }
}
