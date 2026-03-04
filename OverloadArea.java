package muna;

import java.util.Scanner;

class Area 
    {
    double calculate(double radius) 
	{
        return 3.14 * radius * radius;
    	}
    double calculate(double length, double breadth) 
	{
        return length * breadth;
    	}
    double calculate(int base, int height) 
	{
        return 0.5 * base * height;
    	}
    }

public class OverloadArea 
    {
    public static void main(String[] args) 
 {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.calculate(r));

        // Rectangle
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculate(l, b));

        // Triangle
        System.out.print("\nEnter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Area of Triangle: " + obj.calculate(base, height));

        sc.close();
    }
}