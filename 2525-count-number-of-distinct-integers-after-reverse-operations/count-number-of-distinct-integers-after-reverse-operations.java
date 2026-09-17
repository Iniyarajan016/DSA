class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> mp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            mp.add(nums[i]);
            int n=nums[i];
            int rnum=0;
            while(n!=0){
                int rev=n%10;
                rnum=(rnum*10)+rev;
                n/=10;
            }
            mp.add(rnum);
        }
        return mp.size();
    }
}