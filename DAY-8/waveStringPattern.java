import java.util.Scanner;

class waveStringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            s.append(str.charAt(i));
        }
        for (int i = 1; i < str.length(); i += 2) {
            s.append(str.charAt(i));
        }
        sc.close();
        System.out.println(s);
    }
}