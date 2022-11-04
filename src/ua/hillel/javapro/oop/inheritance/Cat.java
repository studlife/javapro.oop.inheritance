package ua.hillel.javapro.oop.inheritance;

public class Cat extends Animal{

    private static int countCat;

    Cat(String name) {
        super(name);
        countCat++;
    }


    @Override
    public void run(int x) {
        if (x < 0) {
            System.out.println(super.getName() + " пішов в ішну сторону");
        } else if (x == 0) {
            System.out.println(getName() + " стоїть на місці та мурчить");
        } else if (x > 200) {
            System.out.println(getName() + " втомився і пробіг всього 200 метрів із " + x + " метрів");
        } else {
            System.out.println(getName() + " пробіг " + x + " метрів");
        }
    }

    @Override
    public void swim(int x) {
        System.out.println("Шкода котика! Але " + getName() + " не вміє плавати...");
    }


    public static void getCountCat() {
        System.out.println( Cat.countCat + " - кота прийняло участь");
    }
}
