package d17_super;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Hello, I am animal.");
    }

    public void eat() {
        System.out.println("Munch munch");
    }

    protected void doSomethingPrivate() {
        System.out.println("Hey this method is private.");
    }
}
