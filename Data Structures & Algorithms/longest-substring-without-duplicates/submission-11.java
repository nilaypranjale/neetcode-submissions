class Solution {
    public int lengthOfLongestSubstring(String s) {
        //optimized: sliding window
        
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        Map<Character,Integer> seen = new HashMap<>();
        int l = 0, r = 0;
        int res = 0;
        while(r < s.length())
        {
            if(seen.containsKey(s.charAt(r)))
            {
                l = Math.max(seen.getOrDefault(s.charAt(r),0)+1,l);
            }
            seen.put(s.charAt(r),r);
            res = Math.max(res,(r-l)+1);
            r++;
        }
        return res;
    }
}
