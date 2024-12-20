class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int visited[][]= new int[m][n];
        Queue<Pair> q = new LinkedList<>();

        int islands = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    islands ++;
                    bfs(grid,visited,i,j,m,n);
                }
            }
        }
        return islands;

    }

    public void bfs(char[][] grid,int[][] vis,int i,int j,int m,int n) {
        vis[i][j] = 1;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        while(!q.isEmpty())
        {
            Pair curr = q.poll();

           // delta row and delta column
            int delrow[] = {-1, 0, +1, 0}; 
            int delcol[] = {0, -1, 0, +1}; 


            for (int k = 0; k < 4; k++) {
                int nrow = curr.f + delrow[k];
                int ncol = curr.s + delcol[k];
                // check for valid unvisited land neighbour coordinates
                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n &&
                    vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    q.add(new Pair(nrow,ncol));    
                    vis[nrow][ncol] = 1;
                }
            }
        }
    }


}

class Pair{
    int f;
    int s ;
    public Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}