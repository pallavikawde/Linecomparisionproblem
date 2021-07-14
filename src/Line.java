import java.util.Scanner;
//create class line

public class Line {
	//use main methode
	
	public static void main (String[] args) {
		//take user input first line
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values for first line ");
	System.out.println("x1");
	int a=sc.nextInt();
	
	System.out.println("y1");
	int b=sc.nextInt();
	
	System.out.println("x2");
	int c=sc.nextInt();

	System.out.println("y2");
	int d=sc.nextInt();
	
//use  length formula &calculate length for first line
	
	 double length=Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
	System.out.println("length is= " +length);
	
	//input for second line
	
	System.out.println("enter values for second line ");
	System.out.println("p1");
	int p1=sc.nextInt();
	
	System.out.println("q1");
	int q1=sc.nextInt();

	System.out.println("p2");
	int p2=sc.nextInt();

	System.out.println("q2");
	int q2=sc.nextInt();
	
//calculated length for second line
	
	 double length2=Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
	System.out.println("length 2 is= " +length2);
	
	//check length is equal or not
	
	if(length == length2) 
	{
		System.out.println("line are equal");
	}
	else 
	{
		System.out.println("line are not equal");
	}
	// compare two length
	
	if (length>length2 ) {
	System.out.println("length is greater");
	}
	if(length2>length) {
		System.out.println("length2 is greater");
	
	}		
	}}	
	

