/*Aim: Construct the code using given statement Create a class First in learnjava 
package that access it in another class Second by using import keyword.
Author: Uday Agre
DOP:5 march 2024
*/
import learnjava.*;
import nupur.*;

class PracticalNo6{
    public static void main(String[] args)
    {
        System.out.println("Using package learnjava");
        first obj1 = new first();
        obj1.display();

        System.out.println("\n Using package nupur");
        Nupur obj2 = new Nupur();
        obj2.display();
    }

}