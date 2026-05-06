class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1) return 0;
        int res = 0, streak = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i+1] == nums[i]+1)
                streak++;
            else if(nums[i+1]== nums[i])
                continue;
            else
            {
                res = Math.max(res, streak);
                streak = 1;
            }
        }
        res = Math.max(res,streak);
        return res;
    }
}
