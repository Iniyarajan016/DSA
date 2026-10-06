class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> sb=new HashSet<>();
        int[] a=new int[friends.length];
        for(int n:friends){
            sb.add(n);
        }
        int j=0;
        for(int i=0;i<order.length;i++){
            if(sb.contains(order[i])){
                a[j++]=order[i];
            }
        }
        return a;
    }
}