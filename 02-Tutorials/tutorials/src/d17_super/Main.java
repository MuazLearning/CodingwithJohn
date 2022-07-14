package d17_super;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 3, "Cat food");
//        cat.makeNoise();
//        cat.eat();

        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.catFoodPreference);

    }
}
