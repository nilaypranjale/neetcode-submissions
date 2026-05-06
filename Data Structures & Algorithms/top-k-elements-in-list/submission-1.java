class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]); //lambda used because int[] does not implement Comparator

        for(Map.Entry<Integer,Integer> itr : count.entrySet())
        {
            minHeap.offer(new int[]{itr.getValue(),itr.getKey()});
            
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0 ; i < k; i++)
        {
            res[i] = minHeap.poll()[1];
        }
        return res;
    }
}
