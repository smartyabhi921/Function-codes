import java.util.*;

//print a given name in function
public class Abhinav2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        myName(name);
        sc.close();

    }

    public static int myName(String name) {

        System.out.println(name);
        return 1;

    }
}
