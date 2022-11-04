package ua.hillel.javapro.oop.inheritance;

public class Application {
    public static void main(String[] args) {

        Animal bobik = new Dog("Bobik");
        bobik.run(-550);
        bobik.swim(12);

        Dog barboskin = new Dog("Barboskin");
        Dog sharik = new Dog("Sharik");

        Cat vasya = new Cat ("Vasya");
        vasya.run(250);
        vasya.swim(10);

        Cat murzik = new Cat ("Murzik");

        Animal.getCount();
        Dog.getCountDog();
        Cat.getCountCat();

    }
}
