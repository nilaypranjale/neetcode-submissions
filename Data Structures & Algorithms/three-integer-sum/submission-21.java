class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList();
        Map<Integer, Integer> hm = new HashMap();

        for(int n : nums)
        {
            hm.put(n, hm.getOrDefault(n,0)+1);
        }

        for(int i = 0; i < nums.length; i++)
        {
            hm.put(nums[i],hm.get(nums[i])-1);
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j = i + 1; j < nums.length; j++)
            {
                hm.put(nums[j],hm.get(nums[j])-1);    
                if(j>i+1 && nums[j]==nums[j-1]) continue; //j>i+1; coz j=i is ok
                int t = -(nums[i]+nums[j]);
                if(hm.getOrDefault(t,0)>0)
                {
                    res.add(Arrays.asList(nums[i],nums[j],t));
                }
            }
            for(int j = i+1; j < nums.length; j++)
            {
                hm.put(nums[j],hm.get(nums[j])+1);
            }
        }
        return res;
    }
}
