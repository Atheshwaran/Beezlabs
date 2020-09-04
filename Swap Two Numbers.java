import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      System.out.println("Enter x and y");
      int x = 10;
      int y = 15;
      System.out.println("Before Swapping");
      System.out.println("x = "+x);
      System.out.println("y = "+y);
      x = x^y;
      y = y^x;
      x = x^y;
      System.out.println("After Swapping without a third variable");
      System.out.println("x = "+x);
      System.out.println("y = "+y);
    }
}