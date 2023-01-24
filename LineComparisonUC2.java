import java.util.Scanner;

public class LineComparisonUC2
{
    public static void main(String[] args) 
	{
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner= new Scanner(System.in);
		
        System.out.println("Enter 1st line starting point x coordinate:-");
        int x1= scanner.nextInt();

        System.out.println("Enter 1st line starting point y coordinate:-");
        int y1= scanner.nextInt();

        System.out.println("Enter 1st line end point x coordinate:-");
        int x2= scanner.nextInt();

        System.out.println("Enter 1st line end point y coordinate:-");
        int y2= scanner.nextInt();

        System.out.print("Length of 1st line:-");
        double length1= Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println(length1);
		System.out.println();
		
        System.out.println("Enter 2nd line starting point x coordinate:-");
        int Lx1 = scanner.nextInt();

        System.out.println("Enter 2nd line starting point y coordinate:-");
        int Ly1 = scanner.nextInt();

        System.out.println("Enter 2nd line end point x coordinate:-");
        int Lx2 = scanner.nextInt();

        System.out.println("Enter 2nd line end point y coordinate:-");
        int Ly2 = scanner.nextInt();

        System.out.print("length of 2nd line:-");
        double length2 = Math.sqrt((Lx2 - Lx1) ^ 2 + (Ly2 - Ly1) ^ 2);
        System.out.println(length2);
		System.out.println();

        if (length1 == length2) 
		{
            System.out.println("Both lines are Equal");

        } 
		else 
		{
            System.out.println("Both lines are not Equal");
        }

    }
}