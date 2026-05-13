class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String s: strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            if(hm.containsKey(Arrays.toString(ch)))
                hm.get(Arrays.toString(ch)).add(s);
            else
                hm.put(Arrays.toString(ch), new ArrayList(List.of(s)));   
        }
        return new ArrayList(hm.values());
    }
}
