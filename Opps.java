class Motercycle {    /* normal class name 2 keywords to yeah 5  */

    String run;
    String comp;

    public void avgg() {   /*making fuction to call isme kaam hoga  */

        System.out.println("32km");
    }

    public void work() {

        System.out.println(this.run);
        System.out.println(this.comp);
    }

}

public class Opps {
    public static void main(String[] args) {

        Motercycle M1 = new Motercycle();

        M1.run = "yes";
        M1.comp = " coco cola";

        Motercycle M2 = new Motercycle();

        M2.run = "yoyoyp";
        M2.comp = "Hola amigo";

        M1.work();
        M2.work();
        M1.avgg();
        M2.avgg();
    }
}