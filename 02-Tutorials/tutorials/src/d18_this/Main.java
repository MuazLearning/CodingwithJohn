package d18_this;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog("Fido", 3);
        Dog dog = new Dog();
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old.");
        dog.bark();
    }
}
