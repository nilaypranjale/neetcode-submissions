class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;

        int res=0, streak =0;
        Set<Integer> numset = new HashSet();
        for(int n : nums)
        {
            numset.add(n);
        }

        for(int n : numset)
        {
            if(!numset.contains(n-1))
            {
                streak = 1;
            
                while(numset.contains(n+1))
                {
                    streak++;
                    n++;
                }
            }
            res=Math.max(res,streak);
            streak= 0;
        }
        return res;
    }
}