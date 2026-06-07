class Solution {
    public int maxArea(int[] heights) {
        int maxv=0;
        int l=0,r=heights.length-1;
        while(l<r){
            int th=Math.min(heights[l],heights[r]);
            int tvol=th*(r-l);
            if(heights[l]>heights[r]){
                r--;
            }
            else if(heights[l]<=heights[r]){
                l++;
            }
            maxv=Math.max(maxv,tvol);
        }
        return maxv;
    }
}
