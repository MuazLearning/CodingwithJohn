package d05_Final;

public class Dog extends Animal {

    private int walkDistancePreference;

    public void bark() {
        System.out.println("woof");
    }

/*    public void eat() { // Not override. Because This method Animal class final method.
        System.out.println("nom nom nom");
    }*/

    public void eat2() {
        System.out.println("nom nom " + FinalExample.PI);
    }

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }
}
