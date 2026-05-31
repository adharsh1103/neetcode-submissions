class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> twos=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(twos.containsKey(diff))
                return new int[]{ twos.get(diff),i};
            twos.put(nums[i],i);
        }
        return new int[]{};
    }
}
