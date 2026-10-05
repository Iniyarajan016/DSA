class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(mp,0)+1);
        }
        return mp.size();
    }
}