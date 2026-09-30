class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,count1=0,count2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
             count1++; 
             nums1[i]=1;
            }
            sum1+=nums1[i];
            
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0){
              count2++;
              nums2[i]=1;
            }
            sum2+=nums2[i];
        }
        if(sum1<sum2 && count1==0 || sum1>sum2 && count2==0) return -1;
        return  Math.max(sum1,sum2);
    }
}