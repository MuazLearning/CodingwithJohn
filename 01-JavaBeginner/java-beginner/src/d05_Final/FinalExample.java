package d05_Final;

public class FinalExample {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
//        Dog myDog = new Dog();
//        myDog.eat();

//        final Dog myDog = new Dog();
//        myDog = new Dog(); Not new
        final Dog myDog;
        myDog = new Dog();
        myDog.eat();
        myDog.eat2();

//        final double pi = 3.14159;
//        pi = 9;

        System.out.println(PI * 3);
        System.out.println(Math.PI);

    }
}
