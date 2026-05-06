class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //hm<int[],List<str>>
        //<'010',[cat,act]>
        
        Map<String,List<String>> hm = new HashMap<>();
        
        for(String s : strs)
        {
            String hash = sortAnagrams(s);
            if(hm.containsKey(hash))
            {
                hm.get(hash).add(s);
            }
            else
            {
                List<String> ls = new ArrayList<>();
                ls.add(s);
                hm.put(hash, ls);
            }
        }
        
        return new ArrayList(hm.values());
    }
    private String sortAnagrams(String s)
    {
        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        return Arrays.toString(sarr);
    }
}
