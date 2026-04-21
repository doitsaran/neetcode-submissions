class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        Map<Character,Character> openCloseMap = new HashMap<Character,Character>();
        openCloseMap.put(')','(');
        openCloseMap.put(']','[');
        openCloseMap.put('}','{');
        for(char c : s.toCharArray()) {
            // if it is a closing bracket, check if the recent same open brac
            // if it is a opening bracker , push to stack
            if(openCloseMap.containsKey(c)){
                if(!stk.isEmpty() && stk.peek() == openCloseMap.get(c))
                {
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stk.push(c);
            }
            
        }  
        return stk.isEmpty();  
    }
}
