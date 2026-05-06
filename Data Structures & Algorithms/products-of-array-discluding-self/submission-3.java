class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1, post = 1;
        int[] res = new int[nums.length];
        res[0]=pre;
        for(int i = 0; i < nums.length-1; i++)
        {
            pre *= nums[i];
            res[i+1] = pre;
        }
        for(int i = nums.length-1; i > 0 ; i--)
        {
            post *= nums[i];
            res[i-1] *= post;
        }
        return res;
    }
}  
