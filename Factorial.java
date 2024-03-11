import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			num = num * i;
		}
		System.out.println(num);
		sc.close();
	}
}