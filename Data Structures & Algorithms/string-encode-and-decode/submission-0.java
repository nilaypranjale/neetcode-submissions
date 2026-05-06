class Solution {

    public String encode(List<String> strs) {
        StringBuilder encStr = new StringBuilder();
        for(String str : strs)
        {
            String rev = str.length() +"#";
            rev = rev + new StringBuilder(str).reverse().toString();
            System.out.println(rev);
            encStr.append(rev);
        }
        return encStr.toString();
    }

    public List<String> decode(String str) {
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
