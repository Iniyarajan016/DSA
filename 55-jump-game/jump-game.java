class Solution {
    public boolean canJump(int[] nums) {
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(i>start){
                return false;
            }
            start=Math.max(start,nums[i]+i);
        }
        return true;
    }
}