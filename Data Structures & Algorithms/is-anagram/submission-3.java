class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            HashMap<Character,Integer> ana= new HashMap<>();
        // both this method and commented method works, the commented one uses temporary 
        //extra space for an array creation for the string but this doesnt need it
            for(int i=0;i<s.length();i++){
                ana.put(s.charAt(i),ana.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<t.length();i++){
                ana.put(t.charAt(i),ana.getOrDefault(t.charAt(i),0)-1);
            }
            /*
            for(char c:s.toCharArray())
                ana.put(c,ana.getOrDefault(c,0)+1);
            for(char c:t.toCharArray())
                ana.put(c,ana.getOrDefault(c,0)-1);
            */
            for(int i: ana.values())
                if(i!=0)
                    return false;
        }
        return true;
    }
}
