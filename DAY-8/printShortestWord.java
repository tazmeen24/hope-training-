import java.util.Scanner;
public class printShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int min = Integer.MAX_VALUE, i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<str.length()){
            while(i<str.length() && str.charAt(i)==' ')
                i++;
            int count = 0;
            StringBuilder s = new StringBuilder();
            while(i<str.length() && str.charAt(i)!=' '){
                count++;
                s.append(str.charAt(i));
                i++;
            }
            if(min>count && count!=0){
                min = count;
                sb.setLength(0);
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
