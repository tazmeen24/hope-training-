public class firstNonReapeatChar {
    public static void main(String[] args) {
        String str = "aabccde";
        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    break;
                }
            }
            if (j == str.length()) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
