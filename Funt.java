import java.util.*;

public class Funt {

	public static void PrintMyName(String name) {

		System.out.println("Your name is " + name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		PrintMyName(name);
		sc.close();

	}

}
