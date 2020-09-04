import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      
      List<Integer> al = Arrays.asList(1,2,4,6,3,7,8);
      int max = Collections.max(al);
      int min = Collections.min(al);
      for(int i=min;i<=max;i++)
      {
          if(!al.contains(i))
          System.out.println(i);
      }
    }
}