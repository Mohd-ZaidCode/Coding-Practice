class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int near = -1;
        int mindist = Integer.MAX_VALUE;
        for (int i = 0; i < drones.length; i++) {
            int dis = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
            System.out.println(dis);
            if (dis <= drones[i][2]) {
                if (dis < mindist) {
                    near = i;
                    mindist = dis;
                }
            }
        }
        return near;
    }
}