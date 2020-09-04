import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the start range: ");
      int start = sc.nextInt();
      System.out.print("Enter the end range: ");
      int end = sc.nextInt();
      int count=0;
      for(int i=start;i<=end;i++)
      {
          String str = Integer.toString(i);
          for(int j=0;j<str.length();j++)
          {
              if(str.charAt(j) == '1')
              count++;
          }
      }
      System.out.println(count);
    }
}