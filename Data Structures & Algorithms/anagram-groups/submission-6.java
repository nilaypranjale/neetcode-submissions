class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Hashmap to store <string, List<string>>
        // 2. Sort strings

        if(strs == null)
            return new ArrayList();
        if(strs.length<2)
            new ArrayList(List.of(strs));

        Map<String,List<String>> hm = new HashMap();
        for(String s : strs)
        {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            if(hm.containsKey(Arrays.toString(sArr)))
            {
                hm.get(Arrays.toString(sArr)).add(s);
            }
            else
            {
                hm.put(Arrays.toString(sArr),new ArrayList<String>(Arrays.asList(new String[]{s})));
            }
        }
        return new ArrayList(hm.values());
    }
}
