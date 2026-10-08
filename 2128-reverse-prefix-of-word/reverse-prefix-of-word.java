class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int m = 0;
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == ch) {
                st.push(c);
                m = i;
                found = true;
                break;
            }
            st.push(c);
        }
        if (found) {
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            for (int i = m + 1; i < word.length(); i++) {
                sb.append(word.charAt(i));
            }
        }
        else{
            return word;
        }
        return sb.toString();
    }
}