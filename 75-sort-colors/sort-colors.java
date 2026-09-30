class Solution {
    public void sortColors(int[] a) {
       int n=a.length;
        for(int i=n-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
        }
    }
}