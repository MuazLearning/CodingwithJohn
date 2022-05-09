package d02_NullPointerException;

import java.util.ArrayList;
import java.util.List;

public class NullPointerException {
    public static void main(String[] args) {
//        Cat myCat = new Cat();
        Cat myCat = null;
        if (myCat != null)
            myCat.makeNoise();

//        Boolean shouldPrintHello = true;
//        Boolean shouldPrintHello = null;
//        boolean shouldPrintHello = null;
//        boolean shouldPrintHello = true;
//        if(shouldPrintHello){
//            System.out.println("Hello");
//        }

//        List<String> favoriteCheeseburgers;
//        List<String> favoriteCheeseburgers = null;
//        List<String> favoriteCheeseburgers = new ArrayList<>();
//
//        for (String burger : favoriteCheeseburgers)
//            System.out.println(burger);

        List<Cat> cats = new ArrayList<>();
        Cat myOtherCat = new Cat();
        myOtherCat.setName("Jerry");

        if (myOtherCat.getName().equals("Newman"))
            System.out.println("Hello, Newman");
        cats.add(myOtherCat);

        System.out.println(getFirstCatNameLength(cats));

    }

    public static int getFirstCatNameLength(List<Cat> cats) {
        if (cats != null && cats.get(0) != null && cats.get(0).getName() != null)
            return cats.get(0).getName().length();
        return 0;
    }

    private static List<Cat> getCats() {
        return new ArrayList<>();
    }

}
