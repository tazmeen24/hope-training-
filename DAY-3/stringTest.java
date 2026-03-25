public class stringTest {
    public static void main(String[] args){
        String s="learning java programming";
        char[] ch={'a','b','c'};
        System.out.println(new String(ch));
        for(char c:s.toCharArray()){
            System.out.print(c);
        }
        s=s.replace("java", "python");
        System.out.println(s);
    }
}
