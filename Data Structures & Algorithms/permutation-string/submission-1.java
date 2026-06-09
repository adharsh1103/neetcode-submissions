class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        if(n2<n1) return false;
        Map<Character,Integer> ha=new HashMap<>();
        int i=0;
        while(i<n1){
            ha.put(s1.charAt(i),ha.getOrDefault(s1.charAt(i),0)+1);
            i++;
        }
        i=0;
        int j=0;
        Map<Character,Integer> win=new HashMap<>();
        while(i<n2){
            while(i<n2 && i-j<n1){
            win.put(s2.charAt(i),win.getOrDefault(s2.charAt(i),0)+1);
            i++;
            }
            if(win.equals(ha))
                return true;
            win.put(s2.charAt(j),win.getOrDefault(s2.charAt(j),0)-1);
            if(win.get(s2.charAt(j))==0)
            win.remove(s2.charAt(j));
            j++;
        }
        return false;
    }
}
