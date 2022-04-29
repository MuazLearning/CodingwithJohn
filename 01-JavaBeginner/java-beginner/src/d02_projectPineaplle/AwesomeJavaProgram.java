package d02_projectPineaplle;

public class AwesomeJavaProgram {

    public static void main(String[] args) {
/*        int myInt = 7;
        double shoeSize = 9.5;
        char myInitial = 'M';
        String myName = "Muaz";

        double result = myInt * shoeSize;
        System.out.println("myName.length() = " + myName.length());
        System.out.println("myName.toUpperCase() = " + myName.toUpperCase());

        System.out.println("myInt = " + myInt);
        System.out.println("result = " + result);*/

//        printName("Muaz");
//        System.out.println(printName("Muaz", 6));

/*        for (int i = 0; i < 1000; i++) {
            System.out.println("These pretzels are making me thirsty");

        }*/

        Cat.dingDong();

        Cat myCat = new Cat();
        myCat.name = "Fred";
        myCat.age = 6;
        myCat.meow();

        Cat anotherCat = new Cat();
        anotherCat.name = "Stella";
        anotherCat.age = 5;

    }

/*    public static void printName(String name) {
        System.out.println("My name is " + name);
    }*/

/*    public static String printName(String name, int number) {
        if (name.equals("Muaz"))
            System.out.println("This guy is awesome");
        else if (name.equals("Larry"))
            System.out.println("This guy ,s OK I guess");
        else
            System.out.println("I don't know this guy at all");

        if (number > 5)
            System.out.println("So cool");

        return "My name is " + name;
    }*/

}