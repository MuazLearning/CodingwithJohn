package d10_generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    public Cat() {
        System.out.println("Meow");
    }

//    @Override
//    public void eat() {
//        System.out.println("Cat.eat()");
//    }
}
