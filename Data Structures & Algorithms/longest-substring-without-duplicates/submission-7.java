class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;
        if(s.length()==1)
            return 1;

        int result = 1;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length();i++)
        {
            if(sb.toString().contains(String.valueOf(s.charAt(i))))
            {
                result = Math.max(result,sb.length());
                sb = new StringBuilder(sb.substring(sb.indexOf(String.valueOf(s.charAt(i)))+1));
                sb.append(s.charAt(i));
            }
            else
            {
                sb.append(s.charAt(i));    
            }
        }
        result = Math.max(result,sb.length());
        return result;
    }
}
