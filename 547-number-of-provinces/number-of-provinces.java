class Solution {
    public int findCircleNum(int[][] isConnected) {
        int l = isConnected.length;
        int vis[] = new int[l]; 
        int count = 0; 
        for(int i = 0;i<l;i++) {
            if(vis[i] == 0) {
               count++;
               dfs(i, isConnected, vis); 
            }
        }
        return count; 
    }

    public void dfs(int i, int[][] M, int[] visited) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(j,M, visited);
            }
        }
    }

}