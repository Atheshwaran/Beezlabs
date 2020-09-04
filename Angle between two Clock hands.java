import java.util.*;
public class MyClass {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                System.out.print("Time : ");
		String time=sc.nextLine();
		String t[]=time.split(":");
		Integer h=Integer.parseInt(t[0]);
		Integer m=Integer.parseInt(t[1])/5;
		int ans=0;
		for(int i=h;i<m;i++){
		    ans+=30;
		}
		System.out.print(ans+" "+"degree");
		
	}
}