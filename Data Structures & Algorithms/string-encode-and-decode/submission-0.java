class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int  i=0;i<strs.size();i++){
            sb.append(strs.get(i));
      //      if(i!=strs.size()-1)
            sb.append("|____|");
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int n=str.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        List<String> de = new ArrayList<>();
        while(i<n){
            if(str.substring(i,i+6).equals("|____|"))
            {
                de.add(sb.toString());
                sb.setLength(0);
                i=i+6;
            }
            else{
            sb.append(str.charAt(i));
            i++;
            }
        }
        return de;
    }
}
