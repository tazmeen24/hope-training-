class Except{
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println("Number is divided by zero");
        } catch(Exception e){
            System.out.println(e);
        }

        try{
            String s=null;
            System.out.println(s.length());
        } catch(NullPointerException e){
            System.out.println("No value present");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}