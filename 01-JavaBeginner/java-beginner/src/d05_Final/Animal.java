package d05_Final;

public class Animal { // final not be extended

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final void eat() {
        System.out.println("munch munch");
    }
}
