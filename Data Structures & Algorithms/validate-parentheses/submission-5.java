class Solution {
    public boolean isValid(String s) {
        Deque<Character>stack=new ArrayDeque<>();
        int i=0,n=s.length();
        if(n==1) return false;
        while(i<n){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='[')
               { 
                stack.push(s.charAt(i));
                if(i==n-1) return false;}
            if(s.charAt(i)==')' || s.charAt(i)=='}'|| s.charAt(i)==']'){
                if(!stack.isEmpty() && stack.peek()=='(' && s.charAt(i)==')')
                    stack.pop();
                else if(!stack.isEmpty() && stack.peek()=='{' && s.charAt(i)=='}')
                    stack.pop();
                else if(!stack.isEmpty() && stack.peek()=='[' && s.charAt(i)==']')
                    stack.pop();
                else
                    return false;
            }
            i++;       
            
         }
         if(stack.isEmpty())
         return true;
         else 
         return false;
    }
}
