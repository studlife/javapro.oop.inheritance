package ua.hillel.javapro.oop.inheritance;

public class Dog extends Animal{
    private static int countDog;

    Dog(String name) {

        super(name);
        countDog++;
    }


    @Override
    public void run(int x) {
        if (x < 0) {
            System.out.println("Нажаль, " + super.getName() + " не вміє бігати задом!");
        } else if (x == 0) {
            System.out.println(getName() + " стоїть на місці");
        } else if (x > 500) {
            System.out.println(getName() + " втомився і пробіг всього 500 метрів із " + x + " метрів");
        } else {
            System.out.println(getName() + " пробіг " + x + " метрів");
        }
    }

    @Override
    public void swim(int x) {
        if (x < 0) {
            System.out.println(getName() + " пливе в іншу сторону");
        } else if (x == 0) {
            System.out.println(getName() + " стоїть на березі і чекає команди");
        } else if (x > 10) {
            System.out.println(getName() + " проплив 10 метрів, більше не може... Требя рятувати!");
        } else {
            System.out.println(getName() + " поплив  " + x + "метрів");
        }
    }


    public static void getCountDog() {
        System.out.println( Dog.countDog + " - песика прийняло участь");
    }
}
