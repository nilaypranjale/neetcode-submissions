class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        for(int i=0, j=s.length()-1; i< s.length()/2; i++,j-- )
        {
            System.out.print(" "+s.charAt(i)+":"+s.charAt(j));
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
