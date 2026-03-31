public class Kpattern {
        public static void main(String[] args) {
        String str = "WORD";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (str.length() / 2 > i) {
                for (int j = 0; j < str.length() - i - 1; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print(str.charAt(str.length() - i - 1));
            System.out.println();
        }
    }
}
