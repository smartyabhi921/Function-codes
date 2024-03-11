public class Practiceee {

    public static int myName() {

        System.out.println("gandu");
        return 1;
    }

    public static int add() {

        int a = 10;
        int b = 10;
        return a + b;
    }

    public static int mul(int h, int d) {

        return h * d;
    }

    public static int sub(int a, int b) {

        return a - b;
    }

    public static void main(String[] args) {
        int d = 10;
        int j = 7;
        System.out.println("sum of num " + add());
        System.out.println(myName());
        System.out.println(sub(20, 10));

        System.out.println(mul(d, j));

    }
}
