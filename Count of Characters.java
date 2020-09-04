import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      int count=0;
      String str = "Developing Product based on Artificial Intelligence, Machine Learning and Robotic Process Automation.";
      for(int i=0;i<str.length();i++)
      {
          if(Character.isLetter(str.charAt(i)))
          {
              count++;
          }
      }
      System.out.println(count);
    }
}