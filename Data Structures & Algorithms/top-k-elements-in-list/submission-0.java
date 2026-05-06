class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Sorting - using HashMap & Pair<int,int>
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<int[]> pair = new ArrayList<>(); // Pair<int,int>
        for(Map.Entry<Integer,Integer> itr : count.entrySet())
        {
            pair.add(new int[]{itr.getValue(),itr.getKey()});
        }
        pair.sort((a,b)->b[0]-a[0]);//pair.sort((a,b)-> Integer.compare(b[0],a[0])); //desc

        int[] result = new int[k];
        for(int i = 0 ; i < k ; i++)
        {
            result[i] = pair.get(i)[1];
        }
        return result;
    }
}
