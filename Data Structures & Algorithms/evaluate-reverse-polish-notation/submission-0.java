class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String c:tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int n1=stack.pop();
                int n2=stack.pop();
                int res;
                if(c.equals("+")) stack.push(n2+n1);
                else if(c.equals("-")) stack.push(n2-n1);
                else if(c.equals("*")) stack.push(n2*n1);
                else if(c.equals("/")) stack.push(n2/n1);
            }
            else
            stack.push(Integer.parseInt(c));
        }
        return stack.pop();
    }
}
