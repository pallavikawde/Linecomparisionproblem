import java.util.Scanner;

public class Line {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values for first line ");
	System.out.println("x1");
	int a=sc.nextInt();
	
	System.out.println("y1");
	int b=sc.nextInt();
	System.out.println("enter value for second line");
	System.out.println("x2");
	int c=sc.nextInt();

	System.out.println("y2");
	int d=sc.nextInt();
	

	 double length=Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
	System.out.println("length is= " +length);
	}

}
