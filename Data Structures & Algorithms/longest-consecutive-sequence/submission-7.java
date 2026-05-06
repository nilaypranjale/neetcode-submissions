class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)
            return 0;

        int res = 0;
        Set<Integer> numset = new HashSet();
        for(int n : nums)
        {
            numset.add(n);
        }

        for(int n : numset)
        {
            int streak = 0;
            if(!numset.contains(n-1))
            {
                while(numset.contains(n+streak))
                {
                    streak++;
                }
                res = Math.max(res,streak);
            }
        }
        return res;
    }
}
