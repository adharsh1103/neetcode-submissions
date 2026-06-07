class Solution {
    public int maxProfit(int[] nums) {
        int l=0,r=1;
        int max=0;
        while(r<nums.length){
            if(nums[r]>nums[l]){
                max=Math.max(max,nums[r]-nums[l]);
            }
            else
                l=r;
            r++;
        }
        return max;
    }
}
