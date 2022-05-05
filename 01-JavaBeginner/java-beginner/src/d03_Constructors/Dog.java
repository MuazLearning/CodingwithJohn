package d03_Constructors;

public class Dog {

    String name;
    int age;

    public Dog() {
        name = "Kramer";
        age = 4;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
