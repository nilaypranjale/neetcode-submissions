class Solution {
    public int trap(int[] height) {
        int[] maxL = new int[height.length];
        int[] maxR = new int[height.length];
        int res = 0;

        for(int i = 1, j = height.length-2; i < height.length && j >=0 ; i++,j--)
        {
            maxL[i] = Math.max(maxL[i-1], height[i-1]);
            maxR[j] = Math.max(maxR[j+1], height[j+1]);
        }

        for(int i = 0; i < height.length; i++)
        {
            int area = Math.min(maxL[i],maxR[i]) - height[i];
            if(area<0)  area=0;
            res+=area;
        }
        
        return res;
    }
}