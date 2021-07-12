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
	
	
	System.out.println("enter values for first line ");
	System.out.println("p1");
	int p1=sc.nextInt();
	
	System.out.println("q1");
	int q1=sc.nextInt();
	System.out.println("enter value for second line");
	System.out.println("p2");
	int p2=sc.nextInt();

	System.out.println("q2");
	int q2=sc.nextInt();
	

	 double length2=Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
	System.out.println("length 2 is= " +length2);
	
	if(length == length2) 
	{
		System.out.println("line are equal");
	}
	else 
	{
		System.out.println("line are not equal");
	}
	
	}
}
