package d10_ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Create

        // Can hold primitives or objects
        // Arrays - Can't add an element to the end of the array due to it having a fixed size
        // String[] friends = new String[4];
        String[] friendsArray = {"Jhon", "Chris", "Eric", "Luke"};

        // Can only hold objects. But supports wrapper types for primitives
        // Grows and shrinks automatically!
        // ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Jhon", "Chris", "Eric", "Luke"));

        // Get Element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        // Get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // Add an element
        // You can't do that with Arrays :(
        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(4));

        // Set an element
        friendsArray[0] = "Carl";
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArray[0]);
        System.out.println(friendsArrayList.get(0));

        // Remove an element
        // You can't do that with Arrays :(
        friendsArrayList.remove("Chris");
        System.out.println(friendsArrayList.get(1));

        // Print
        System.out.println(Arrays.toString(friendsArray));
        System.out.println(friendsArrayList);

    }
}
