package d18_this;

public class Dog {
    private String name;
    private final int age;

    public Dog() {
        this("Fido", 0); // Must first line
        System.out.println("Constructing a dog...");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.println("Bark!");
    }
}
