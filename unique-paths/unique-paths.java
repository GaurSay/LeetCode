class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
         for (int[] row : dp)
            Arrays.fill(row, -1);
        
        return helper(m-1,n-1,dp);
    }
    
    private static int helper(int i, int j,int dp[][]){
        if (i == 0 || j == 0) {
            return 1;
        }
        if(dp[i-1][j] == -1){
            dp[i-1][j] = helper(i-1,j,dp);
        }
        if(dp[i][j-1] == -1){
            dp[i][j-1] = helper(i,j-1,dp);
        }         
        return dp[i-1][j] + dp[i][j-1] ;
    }
}