class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0, left = 0, right = 0, n = g.length, m = s.length;
        while (left < n && right < m) {
            if (g[left] <= s[right]) {
                child++;
                left++;
                right++;
            } else {
                right++;
            }
        }
        return child;
    }
}