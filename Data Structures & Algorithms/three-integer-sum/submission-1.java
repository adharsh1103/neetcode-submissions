class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //  int n=nums1.length;
       // int [] nums=new int[n];
        Arrays.sort(nums);
        List<List<Integer>> op=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> tem=new ArrayList<>();
                    tem.add(nums[i]);
                    tem.add(nums[j]);
                    tem.add(nums[k]);
                    op.add(tem);
                    j++;
                    while(j<k && nums[j]==nums[j-1])
                        j++;
                }
                if(j<k && nums[i]+nums[j]+nums[k]>0)
                    k--;
                if(j<k && nums[i]+nums[j]+nums[k]<0)
                    j++;
            }
        }
        return op;
    }
}
