//Chapter 7: Programming Exercise 5

import java.util.*;

public class Ch7_PrExercise5
{

    static final double PI = 3.1416;

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {

       double x1, x2, y1, y2;
       double circleRadius;

       System.out.print("Enter the x and y coordinates of the center of the circle: ");
       x1 = console.nextDouble();
       y1 = console.nextDouble();
       System.out.println();

       System.out.print("Enter the x and y coordinates of a point on the circle: ");
       x2 = console.nextDouble();
       y2 = console.nextDouble();
       System.out.println();

       circleRadius = radius(x1, y1, x2, y2);

       System.out.printf("Radius =        %.2f %n", circleRadius);
       System.out.printf("Diameter =      %.2f %n", (2 * circleRadius));
       System.out.printf("Circumference = %.2f %n", circumference(circleRadius));
       System.out.printf("Area =          %.2f %n", area(circleRadius));
    }

   public static double distance(double firstX, double firstY,
                                 double secondX, double secondY)
   {
       return Math.sqrt(Math.pow((secondX - firstX),2)
               + Math.pow((secondY - firstY), 2));
   }

   public static double radius(double firstX, double firstY,
                               double secondX, double secondY)
   {
       return distance(firstX,firstY,secondX,secondY);
   }

   public static double circumference(double cRadius)
   {
       return (2 * PI * cRadius);
   }

   public static double area(double cRadius)
   {
       return (PI * Math.pow(cRadius, 2));
   }
}

