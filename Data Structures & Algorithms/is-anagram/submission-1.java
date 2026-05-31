class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            HashMap<Character,Integer> ana= new HashMap<>();
            for(char c:s.toCharArray())
                ana.put(c,ana.getOrDefault(c,0)+1);
            for(char c:t.toCharArray())
                ana.put(c,ana.getOrDefault(c,0)-1);
            for(int i: ana.values())
                if(i!=0)
                    return false;
        }
        return true;
    }
}
