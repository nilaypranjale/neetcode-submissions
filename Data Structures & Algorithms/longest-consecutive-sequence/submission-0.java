class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)
        {
            return 0;
        }
        int result = 1, count=1;
        Set<Integer> numset = new HashSet<>();

        for(int num : nums)
        {
            numset.add(num);
        } 

        for(int n : nums)
        {
            int newn= n+1;
            while(numset.contains(newn))
            {
                count++;
                newn++;
            }
            result=Math.max(result,count);
            count=1;
        }
        return result;
    }
}
