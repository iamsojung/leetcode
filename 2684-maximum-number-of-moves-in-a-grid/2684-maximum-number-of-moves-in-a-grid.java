class Solution {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int max[][] = new int[m][n];
        for(int c = n-2; c > -1; c --){
            for(int r = 0; r < m; r ++){
                int cu = grid[r][c];
                if(r-1 > -1 && grid[r-1][c+1] > cu)
                    max[r][c] = Math.max(max[r][c], max[r-1][c+1]+1);
                if(grid[r][c+1] > cu)
                    max[r][c] = Math.max(max[r][c], max[r][c+1]+1);
                if(r+1 < m && grid[r+1][c+1] > cu)
                    max[r][c] = Math.max(max[r][c], max[r+1][c+1]+1);
            }
        }
        for(int r = 0; r < m; r ++){
            ans = Math.max(ans, max[r][0]);
        }
        return ans;
    }
}