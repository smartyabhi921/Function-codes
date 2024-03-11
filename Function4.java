import java.util.Scanner;

public class Function4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        /* System.out.println(addSum(a, b, c)); */
        sc.close();
        sumODD(n);

    }

    private static int addSum(int a, int b, int c) {

        int sum = (a + b + c) / 3;
        return sum;
    }

    private static void sumODD(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++)

        {

            if (i % 2 != 0) {

                sum = sum + i;

            }

        }
        System.err.println(sum);
    }
}
