package d10_generics;

import java.io.Serializable;

public class Printer2 <T extends Animal & Serializable>{
    T t;

    public Printer2(T t) {
        this.t = t;
    }

    public void print() {
        t.eat();
        System.out.println(t.getClass().getSimpleName());
    }
}
