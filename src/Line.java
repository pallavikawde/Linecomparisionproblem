import java.util.Scanner;

class Linec
{
    double lenght;
    double lenght_2;
    public void lenght()
    {
        Scanner sc = new Scanner(System.in);
        // taking Input for 1st line
        System.out.println("Enter value for line_1");
        System.out.println("X1 is");
        int x1 = sc.nextInt();

        System.out.println("Y1 is");
        int y1 = sc.nextInt();


        System.out.println("X2 is");
        int x2 = sc.nextInt();

        System.out.println("Y2 is");
        int y2 = sc.nextInt();
        // calculated length
        lenght = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("Lenght of line_1 is "+lenght);


        // taking input for 2nd line
        System.out.println("Enter value for line_2");
        System.out.println("A1 is");
        int a1 = sc.nextInt();

        System.out.println("B1 is");
        int b1 = sc.nextInt();


        System.out.println("A2 is");
        int a2 = sc.nextInt();

        System.out.println("B2 is");
        int b2 = sc.nextInt();
        // calculated length
        lenght_2 = Math.sqrt((a2-a1) * (a2-a1) + (b2-b1) * (b2-b1));
        System.out.println("Lenght of line_2 is "+lenght_2);
    }

    public void lineCompare()
    {
        if(lenght == lenght_2)
        {
            System.out.println("line are equal");
        }
        else
        {
            System.out.println("line are not equal");
        }

        if(lenght > lenght_2)
        {
            System.out.println("line 1 is greater");
        }
        if(lenght < lenght_2)
        {
            System.out.println("line 2 is greater");
        }
    }
}
public class Line {

    public static void main(String[] args)
    {
        Linec obj = new Linec();
        obj.lenght();
        obj.lineCompare();
    }

}