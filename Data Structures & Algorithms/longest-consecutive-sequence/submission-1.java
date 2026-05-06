class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)
        {
            return 0;
        }
        int result = 1, count = 1;
        Set<Integer> numset = new HashSet<>();

        for(int n : nums)
        {
            numset.add(n);
        }

        for(int num : nums)
        {
            int curr=num;
            if(!numset.contains(num-1))
            {
                while(numset.contains(curr+1))
                {
                    count++;
                    curr++;
                }
                result = Math.max(result,count);
                count = 1;
            }
        } 
        return result;
    }
}
