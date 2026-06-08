class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int n=s.length();
        int maxl=0;
        Map<Character,Integer> hm=new HashMap<>();
        int j=0;
       // if(n==1) return 1;
        while(i<n){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            while(j<=i && hm.get(s.charAt(i))>1){
                hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)-1);
                j++;
            }
            maxl=Math.max(maxl,i-j+1);
            i++;
        }
        return maxl;
    }
}

