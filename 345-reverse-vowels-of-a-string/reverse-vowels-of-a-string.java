class Solution {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                || c == 'U';
    }

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (isVowel(ch[left]) && isVowel(ch[right])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (isVowel(ch[left]) && !isVowel(ch[right])) {
                right--;
            } else if (!isVowel(ch[left]) && isVowel(ch[right])) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}