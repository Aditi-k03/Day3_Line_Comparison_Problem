import java.util.Scanner;

public class LineComparisonUC1
{
    public static void main(String[] args) 
	{
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner= new Scanner(System.in);
		
        System.out.println("Enter starting point x coordinate:-");
        int x1= scanner.nextInt();

        System.out.println("Enter starting point y coordinate:-");
        int y1= scanner.nextInt();

        System.out.println("Enter end point x coordinate:-");
        int x2= scanner.nextInt();

        System.out.println("Enter end point y coordinate:-");
        int y2= scanner.nextInt();

        System.out.print("Length of line:-");
        double length1= Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println(length1);
    }
}