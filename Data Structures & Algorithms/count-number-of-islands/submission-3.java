class Solution {
    private static final int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}}; 
    public int numIslands(char[][] grid) {
        if(grid == null) return 0;

        int ROWS = grid.length, COLS = grid[0].length;
        int island = 0;

        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j, grid);
                    island++;
                }
            }
        }
        return island;
    }
    private void dfs(int i, int j, char[][] grid)
    {
        if(i>=grid.length || j>= grid[0].length
        || i<0 || j<0 || grid[i][j]=='0') return;

        grid[i][j]='0';
        for(int[] d : dir)
        {
            dfs(i+d[0],j+d[1], grid);
        }
    }
}
