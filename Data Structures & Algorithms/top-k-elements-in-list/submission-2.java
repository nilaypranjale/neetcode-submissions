class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Bucket Sort:
        
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int i = 0; i<bucket.length; i++)
        {
            bucket[i]= new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> itr : count.entrySet())
        {
            bucket[itr.getValue()].add(itr.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = bucket.length-1; i > 0  && index <k; i--)
        {
            for(int n : bucket[i])
            {
                res[index++] = n;
            }
            if(index==k)
                return res;
        }

        return res;
    }
}
