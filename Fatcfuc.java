import java.util.*;

public class Fatcfuc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factNum(n);

        sc.close();

    }

    public static void factNum(int n) {

        if (n < 0) {

            System.out.println("invalid input");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;

        }

        System.out.println(fact);
        return;
    }
}
