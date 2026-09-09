import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int res = 0;

        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(i, vis, isConnected);
                res++;
            }
        }

        return res;
    }

    public void bfs(int start, boolean[] vis, int[][] arr) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int front = q.remove();

            for (int j = 0; j < n; j++) {
                if (arr[front][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
}