package d06_lambda;

public class Cat implements Printable {

    public String name;
    public int age;

    public Cat() {
    }

    public void print() {
        System.out.println("Meow!");
    }

    public void print(String suffix) {
        System.out.println("Meow!");
    }

    @Override
    public String print(String suffix, String prefix) {
        System.out.println(prefix + "Meow!" + suffix);
        return prefix + "Meow!" + suffix;
    }
}
