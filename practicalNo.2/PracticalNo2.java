/*Aim:- Practical No. 2
Author:- Nupur Y. Kuhite
Version:- 2.0
Date:- 6 Feb 2024
*/

import java.util.Scanner;

class PracticalNo2 
{
    public static void main(String[] argv) 
    {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = r.nextDouble();

        if (radius <= 0) 
        {
            System.out.println("Please enter a non-zero positive number for the radius.");
            System.out.println();
        } 
        else 
        {
            double perimeter = 2 * (Math.PI * radius);
            double area = Math.PI * (radius * radius);
            System.out.println("Radius = " + radius);
            System.out.println("Perimeter of Circle = " + perimeter);
            System.out.println("Area of Circle = " + area);
            System.out.println();
        }
    }
}