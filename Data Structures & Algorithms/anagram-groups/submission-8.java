class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String s: strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            if(hm.getOrDefault(Arrays.toString(ch),null)==null)
                hm.put(Arrays.toString(ch), new ArrayList(List.of(s)));
            else
            {
                List<String> ls = hm.get(Arrays.toString(ch));
                ls.add(s);
                hm.put(Arrays.toString(ch), ls);
            }
        }
        return new ArrayList(hm.values());
    }
}
