class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)
            return false;
        if(s.length()%2!=0)
            return false;
        Deque<Character> openingBr = new ArrayDeque<>();
        Map<Character,Character> closingBr = new HashMap<>();
        closingBr.put(')','(');
        closingBr.put(']','[');
        closingBr.put('}','{');
        for(char c : s.toCharArray())
        {
            if(closingBr.containsKey(c))
            {
                if(!openingBr.isEmpty() && openingBr.peek()==closingBr.get(c))
                {  
                    openingBr.pop();
                }
                else
                    return false;
            }
            else
            {
                openingBr.push(c);
            }
        }
        return openingBr.isEmpty();
    }
}
