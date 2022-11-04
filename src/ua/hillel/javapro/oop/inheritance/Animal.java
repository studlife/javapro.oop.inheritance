package ua.hillel.javapro.oop.inheritance;

public class Animal {
    private String name;
    private static int count;


    Animal (String name) {
        this.name = name;
        count++;
    }


    public void run (int x) {

    }

    public void swim (int x) {

    }



    public String getName() {
        return name;
    }

    public static void getCount() {

        System.out.println("У тесті взяло участь " + Animal.count + " тварини.");

    }
}
