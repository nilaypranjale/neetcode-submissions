class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int res = 0;
        while(l<r)
        {
            int currVol = (Math.min(heights[l],heights[r]))*(r-l);
            res = Math.max(res,currVol);
            if(heights[l] < heights[r])
                l++; 
            else if(heights[r]< heights[l])
                r--;
            else
            {
                l++;
                r--;
            }
        }
        return res;
    }
}
