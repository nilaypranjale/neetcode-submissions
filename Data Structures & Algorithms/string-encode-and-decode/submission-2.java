class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty())
            return "";
        StringBuilder encStr = new StringBuilder();
        for(String str : strs)
        {
            String rev = new StringBuilder(str).reverse().toString();
            encStr.append(str.length()).append("#").append(rev);
        }
        return encStr.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty())
            return new ArrayList<String>();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while( i < str.length())
        {
            sb.setLength(0);
            while(str.charAt(i)!='#')
            {
                sb.append(str.charAt(i));
                i++;
            }
            int len = Integer.parseInt(sb.toString());
            int lim = len + i + 1;
            sb.setLength(0);
            res.add(sb.append(str.substring(i+1, lim)).reverse().toString());
            i = lim;
        }
        return res;
    }
}
