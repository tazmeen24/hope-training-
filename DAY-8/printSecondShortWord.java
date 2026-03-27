import java.util.Scanner;

public class printSecondShortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE, i = 0;
        String ShortestWord = "", secondShortestWord = "";
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ')
                i++;
            int count = 0;
            StringBuilder sb = new StringBuilder();
            while (i < str.length() && str.charAt(i) != ' ') {
                count++;
                sb.append(str.charAt(i));
                i++;
            }
            if (min > count) {
                secondMin = min;
                min = count;
                secondShortestWord = ShortestWord;
                ShortestWord = sb.toString();
            } else if (secondMin > count && count != min) {
                secondMin = count;
                secondShortestWord = sb.toString();
            }
        }
        System.out.println(secondShortestWord);
        sc.close();
    }
}
