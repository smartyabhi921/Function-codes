import java.util.Scanner;

class Details {

    String name;
    int rollnum;

    public void classname() {

        System.out.println(this.name);
        System.out.println(this.rollnum);
    }

    public void myNamee(String name) {

        System.out.println(name);

    }

    Details(String name, int a) {

        this.name = name;
        this.rollnum = a;
    }

Details(s2) {
    this.name = name;
    this.rollnum = a;
}


}

public class Student {

    public static void main(String[] args) {

        Details s1 = new Details("name", 23);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
 
        Details s2= new Details();
        s1.myNamee(name);
        s1.classname();
    }
}
