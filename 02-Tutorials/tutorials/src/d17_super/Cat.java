package d17_super;

public class Cat extends Animal {

    String catFoodPreference;

    public Cat(String name, int age, String catFoodPreference) {
        super(name, age);
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow Meow Meow!");
//        super.eat();
        eat();

        super.doSomethingPrivate(); // Not accessible for private method.
    }

    public void jump() {
        super.makeNoise();
    }
}
