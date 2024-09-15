class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int visited[][] = new int[m][n];
        int islands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    islands++;
                    DFS(i,j,m,n,visited,grid);
                }
            }
        }
        return islands;
        
    }

    private void DFS(int i,int j,int m,int n,int visited[][],char grid[][]){
        visited[i][j]=1;
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(i,j));

        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.f;
            int c = p.s;
            int nrow = r;
            int ncol = c-1;
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && visited[nrow][ncol]==0){
                visited[nrow][ncol] = 1;
                q.add(new Pair(nrow,ncol));
            }
            nrow = r;
            ncol = c+1;
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && visited[nrow][ncol]==0){
                visited[nrow][ncol] = 1;
                q.add(new Pair(nrow,ncol));
            }
            nrow = r-1;
            ncol = c;
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && visited[nrow][ncol]==0){
                visited[nrow][ncol] = 1;
                q.add(new Pair(nrow,ncol));
            }
            nrow = r+1;
            ncol = c;
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && visited[nrow][ncol]==0){
                visited[nrow][ncol] = 1;
                q.add(new Pair(nrow,ncol));
            }
        }
    }
}
class Pair{
    int f;
    int s;
    public Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}