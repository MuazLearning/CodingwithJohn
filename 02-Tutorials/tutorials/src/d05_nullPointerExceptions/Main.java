package d05_nullPointerExceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
        example5();

    }

    private static void example5() {
        List<Cat> cats = new ArrayList<>();
        Cat myCat = new Cat();
        myCat.setName(null);

        if ("Newman".equals(myCat.getName())) { // myCat.getName().equals("Newman") => NullPointerException
            System.out.println("Newman is a cat");
        }
        cats.add(myCat);
    }

    private static void example4() {
        List<Cat> cats = new ArrayList<>();
        Cat myCat = new Cat();
        myCat.setName("Kitty");
        cats.add(myCat);
        System.out.println(getFirstCatNameLength(cats));
    }

    private static void example3() {
        //        List<String> favoriteCheeseburgers = null;
        List<String> favoriteCheeseburgers = new ArrayList<>();

        for (String burger : favoriteCheeseburgers) {
            System.out.println(burger);
        }
    }

    private static void example2() {
        //        Boolean shouldPrintHello = true;
//        Boolean shouldPrintHello = null;
        boolean shouldPrintHello = true;

        if (shouldPrintHello) {
            System.out.println("Hello");
        }
    }

    private static void example1() {
        //        Cat myCat = new Cat();
        Cat myCat = null;
        myCat.age = 10;
        myCat.makeNoise();
    }

    private static int getFirstCatNameLength(List<Cat> cats) {
        if (cats != null && cats.get(0) != null && cats.get(0).getName() != null) {
            cats.get(0).getName().length();
        }

        return 0;
    }

    private static List<Cat> getCats() {
        return new ArrayList<>();
    }

}
