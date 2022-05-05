package d04_Enum;

public class EnumTutorial {
    public static void main(String[] args) {
//        DaysOfTheWeek day = new DaysOfTheWeek();
/*        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        if (day == DaysOfTheWeek.THURSDAY)
            System.out.println("Yay it's almost Friday!");

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values())
            System.out.println(myDay);*/

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness + " => " + Cereals.FROOT_LOOPS.price);

    }
}
