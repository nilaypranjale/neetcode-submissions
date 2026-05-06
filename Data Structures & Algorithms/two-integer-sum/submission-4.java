class Solution {
    public int[] twoSum(int[] nums, int target) {
        //<3,0>
        // <4,1>
        // <5,2>
        // <6,3>
        Map<Integer,Integer> hm = new HashMap();
        for(int i = 0 ; i < nums.length; i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                return new int[]{hm.get(target-nums[i]),i};
            }
            hm.put(nums[i],i);
        }
        return new int[0];
    }
}
