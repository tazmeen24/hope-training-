// 345. Reverse Vowels of a String
class leet345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}