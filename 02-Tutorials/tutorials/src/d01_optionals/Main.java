package d01_optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Cat> cat = findCatByName("Fred");

        /*if (cat.isPresent())
            System.out.println(cat.get().getAge());
        else
            System.out.println(0);*/

//        Cat cat1 = cat.orElse(new Cat("Unkown", 0));
//        System.out.println(cat1.getAge());

        cat.map(Cat::getAge).orElse(0);
    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
//        return Optional.ofNullable(cat);
        return Optional.ofNullable(null);
    }
}
