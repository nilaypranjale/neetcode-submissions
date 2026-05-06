class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<Integer> index = new HashSet<>();
        for(int i =0; i < strs.length; i++)
        {
            if(index.contains(i))
                continue;
            List<String> anagrams = new ArrayList<>();
            anagrams.add(strs[i]);
            for(int j =i+1; j< strs.length; j++)
            {
                if(isAnagram(strs[i],strs[j]))
                {
                    anagrams.add(strs[j]);
                    index.add(j);
                }   
            }
            result.add(anagrams);
        }
        return result;
    }
    public boolean isAnagram(String a, String b){
        if(a.length()!=b.length())
            return false;
        
        int[] count = new int[26];

        for(int i =0; i<a.length(); i++)
        {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }

        for(int n : count)
        {
            if(n!=0)
                return false;
        }
        return true;

    }
}
