/*Aim-Find the method printName. Notice the comment lines showing where you should put your code. This has a name passed into it with the format “<first name> <last name>”.
You will reformat it to be “<last name>, <first name> and print it out.
Example: “Bill Joy” becomes “Joy,Bill”
There will always be at least one space between the first and the last name. There may be extra spaces between the first and last names and extra spaces at the beginning and end of
the name passed in. You will have to strip these out if they are there.

Author- Nupur Kuhite
Version:- 4.0
Date:- 20/02/24*/

class PracticalNo4 
{
    public static void main(String[] argv)
    {
        String fullName = "Nupur Kuhite"; 
        System.out.println("Full Name:- "+ fullName);
        printName(fullName);
    }

    public static void printName(String fn) 
    {
        fn = fn.trim();
        String[] nameParts = fn.split(" "); 
        
        if (nameParts.length >= 2)
        {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1];

            String newName = lastName + "," + firstName;
            System.out.println("Formatted name: " + newName);
        } 
        else
        {
            System.err.println("Error")
        }
    }
}
