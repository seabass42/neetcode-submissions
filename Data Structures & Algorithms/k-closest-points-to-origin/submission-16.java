class XY {
    int x;
    int y;
    int distance;
    public XY(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<XY> pq = new PriorityQueue<>((XY a, XY b) -> {
            return a.distance - b.distance;
        });
        Map<Integer, List<XY>> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int distance = (0 - points[i][0]) * (0 - points[i][0]) + (0- points[i][1]) * (0 - points[i][1]);
            XY curr = new XY(points[i][0], points[i][1], distance);
            pq.offer(curr);
        }
        int j = 0;
        while (j < k) {
            XY curr = pq.poll();
            ans[j][0] = curr.x;
            ans[j][1] = curr.y;
            j++;
        }
        return ans;
    }
}
