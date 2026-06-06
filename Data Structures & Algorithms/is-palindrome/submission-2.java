class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replace(" ","");
        s=s.replaceAll("[^a-zA-Z0-9]","");
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            continue;
            else
            return false;
        }
        return true;
    }
}
