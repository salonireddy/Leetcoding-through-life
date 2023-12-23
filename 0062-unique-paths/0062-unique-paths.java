class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return helper(0,0,m,n,dp);
    }
    int helper(int i, int j, int m, int n,int[][] dp){
        if(i==m-1|| j==n-1) return 1;
        if(dp[i][j] !=0) return dp[i][j];
        dp[i][j] = helper(i,j+1,m,n,dp) + helper(i+1,j,m,n,dp);
        return dp[i][j];
    }
}

/* valid solutin of 2^n complexity but returning TLE.
class Solution {
    int i=0, j=0;
    public int uniquePaths(int m, int n) {
        return helper(0,0,m,n);
    }
    int helper(int i, int j, int m, int n){
        if(i==m-1 || j==n-1) return 1;
        return helper(i,j+1,m,n) + helper(i+1,j,m,n);
    }
}
*/