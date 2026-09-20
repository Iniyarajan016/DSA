class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int a= 26-(s.charAt(i)- 'a' + 1)+1;
            int b=a*(i+1);
            sum+=b;
        }
        return sum;
    }
}