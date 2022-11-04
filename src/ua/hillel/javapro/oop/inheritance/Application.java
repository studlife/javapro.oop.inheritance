package ua.hillel.javapro.oop.inheritance;

public class Application {
    public static void main(String[] args) {

        Animal bobik = new Dog("Bobik");
        bobik.run(-550);
        bobik.swim(12);

        Cat vasya = new Cat ("Vasya");
        vasya.run(250);
        vasya.swim(10);



        System.out.println("У тесті взяло участь " + Animal.getCount() + " тварини.");

    }
}
