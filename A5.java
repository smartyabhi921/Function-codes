
public class A5 {
	public static void printReversePyramid(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printReversePyramid(8);

	}
}
