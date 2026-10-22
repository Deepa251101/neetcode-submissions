class Solution {
    public boolean hasDuplicate(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
        }
        return c>0 ?true:false;
    }
}