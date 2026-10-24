class DSU{
    private int[] Parent, Size;

    public DSU(int n)
    {
        Parent = new int[n+1];
        Size = new int[n+1];
        for(int i = 0; i <= n; i++)
        {
            Parent[i]=i;
            Size[i]=1;
        }
    }

    public int find(int x)
    {
        if(Parent[x]!=x)
        {
            Parent[x]=find(Parent[x]);
        }
        return Parent[x];
    }

    public boolean union(int u, int v)
    {
        int pu = find(u);
        int pv = find(v);

        if(pu==pv) return false;

        if(Size[pu]>=Size[pv])
        {
            Parent[pv]=pu;
            Size[pu]+=Size[pv];
        }
        else
        {
            Parent[pu]=pv;
            Size[pv]+=Size[pu];
        }
        return true;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null) return 0;

        int ROWS = grid.length, COLS = grid[0].length;
        DSU dsu = new DSU(ROWS*COLS);
        
        int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
        int islands = 0;

        for(int r = 0; r < ROWS; r++)
        for(int c = 0; c < COLS; c++)
        {
            if(grid[r][c]=='1')
            {
                islands++;
                for(int[] d : dir)
                {
                    int nr = r+d[0];
                    int nc = c+d[1];
                    if(nr>=0 && nc >= 0 && nr < ROWS && nc< COLS && grid[nr][nc]=='1')
                    {
                        if(dsu.union(r*COLS+c, nr*COLS+nc))
                        {
                            islands--;
                        }
                    }
                }
            }
        }
        return islands;
    }
}
