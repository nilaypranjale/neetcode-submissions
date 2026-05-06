class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int len = nums.length;
        if(len==1)
            return nums[0];

        int max = 0;
        int result=nums[0];
        for(int n : nums)
        {
            if(hm.containsKey(n))
            {
                int count = hm.get(n)+1;
                hm.put(n,count);

                if(hm.get(n)> len/2 || hm.get(n)>max)
                {
                    max=hm.get(n);
                    result = n;
                }
            }
            else
            { 
                hm.put(n,1);
            }
        }
        return result;
    }
}