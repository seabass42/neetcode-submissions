class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : hand) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(hand);
        
        for (int i = 0; i < hand.length; i++) {
            int currNum = hand[i];
            if (counts.getOrDefault(currNum, 0) == 0) continue;

            for (int j = 0; j < groupSize; j++) {
            
                if (counts.getOrDefault(currNum, 0) == 0) return false;

                counts.put(currNum, counts.get(currNum) - 1);
                currNum++;
            }
        
        }
        return true;
    }
}
