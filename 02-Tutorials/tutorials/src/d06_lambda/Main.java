package d06_lambda;

public class Main {

    public static void main(String[] args) {

//        Cat cat = new Cat();
//        cat.print();
//        printThing(cat);

//        printThing(() -> System.out.println("Meow2!"));

//        Printable lambda = s -> System.out.println("Meow3!");
//        Printable lambda = (s, p) -> System.out.println("Meow3! " + s + " " + p);
//        Printable lambda = (s, p) -> {
//            System.out.println("Meow3! " + s + " " + p);
//            return "Meow";
//        };
        Printable lambda = (s, p) -> "Meow" + s + p;
        printThing(lambda);

    }

//    static void printThing(Printable thing) {
//        thing.print();
//    }

    static void printThing(Printable thing) {
        thing.print("!!!!", "***");
    }

}
