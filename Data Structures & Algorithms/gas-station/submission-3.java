class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 1 && gas[0] >= cost[0]) return 0;

        for (int i = 0; i < gas.length; i++) {
            if (gas[i] > cost[i] && canCircle(gas, cost, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean canCircle(int[] gas, int[] cost, int index) {
        int traveled = 0;
        int currGas = 0;
        int currIndex = index;

        while (traveled < gas.length) {
            currGas += gas[currIndex];
            if (cost[currIndex] > currGas) return false;

            currGas -= cost[currIndex];
            currIndex++;
            if (currIndex >= gas.length) {
                currIndex = 0;
            }
            traveled++;
        }

        return true;
    }
}
