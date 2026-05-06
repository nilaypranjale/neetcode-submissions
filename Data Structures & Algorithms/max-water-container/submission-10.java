class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0, r = heights.length-1;

        while(l < r)
        {   
            int minH = Math.min(heights[l], heights[r]);
            int vol = minH * (r - l);        
            res = Math.max(res, vol);
            while(l<r && heights[l] <= minH)
                l++;
            while(l<r && heights[r] <= minH)
                r--;
        }
        return res;
     }
}
