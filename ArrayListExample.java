import java.util.ArrayList; //To make use of arrayLists
import java.util.Collections; //To make use of shuffling

public class ArrayListExample {
  public static void main(String[ ] args) {
    ArrayList<String> colors = new ArrayList<String>();
    //ArrayList<String> colors = newArrayList<String>(10);
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");
    colors.add("Pink");
    System.out.println(colors);
    colors.set(2,"Blue"); //Placing a color in the correct position
    System.out.println(colors);
    System.out.println(colors.get(2));
    
    //Try to shuffle colors
    System.out.println(colors);
    Collections.sort(colors); //Shuffles colors
    System.out.println(colors);
    
  }
}
