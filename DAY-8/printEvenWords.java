import java.util.Scanner;
class printEvenWords{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder result = new StringBuilder();
    int i=0;
    while(i<str.length()){
        while(i<str.length() && str.charAt(i)==' '){
            i++;
        }
        StringBuilder word = new StringBuilder();
        int count = 0;
        while(i<str.length() && str.charAt(i)!=' '){
            count++;
            word.append(str.charAt(i));
            i++;
        }
        if(count%2==0){
            result.append(word).append(" ");
        }
    }
    System.out.println(result.toString().trim());
    sc.close();
    }
}