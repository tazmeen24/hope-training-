class calculate {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b +c;
    }
    double add(double a, double b){
        return a + b;
    }
}

public class Math {
    public static void main(String[] args) {
        calculate c = new calculate();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
    }
}
