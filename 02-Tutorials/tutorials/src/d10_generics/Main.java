package d10_generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        IntegerPrinter<Integer> printer = new IntegerPrinter<>(25);
//        Printer<String> printer = new Printer<>("ASD");
//        printer.print();

//        ArrayList<Cat> cats = new ArrayList<>();
//        ArrayList<Object> cats = new ArrayList<>();
//        cats.add(new Cat());
//        cats.add(new Dog());
//
//        Cat myCat = (Cat) cats.get(1);

//        Printer<Cat> printer = new Printer<>(new Cat());
//        printer.print();

//        shout("Hello");
//        shout(58);
//        shout(new Cat());

//        shout("Hello", 123);
//        shout(58, "Hello");
//        shout(new Cat(), "Hello");

//        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
//        printList(intList);

        List<Cat> cats = Arrays.asList(new Cat());
        printList(cats);

    }

    private static <T, V> T shout (T t, V v) {
        System.out.println(t + "!! " + v);
        return t;
    }

//    private static void printList (List<?> myList) {
//        System.out.println(myList);
//    }

    private static void printList (List<? extends Animal> myList) {
        System.out.println(myList);
    }

}
