/*Aim:- Execution of two or more threads occurs in a random order. The keyword ‘synchronized’
in Java is used to control the execution of thread in a strict sequence. In the following, the
program is expected to print some numbers. Do the necessary use of ‘synchronized’
keyword, so that, the program prints the output in the following order:
-----------------OUTPUT-------------------
   5 10 15 20 25 30 35 40 45 50
------------------------------------------
Author:- Nupur Kuhite
Version:- 9.0
Date:- 26/03/2024
*/

public class PracticalNo9
{  
    public static void main(String args[])
    {  
        final Synchronization obj = new Synchronization();
        Thread t1=new Thread()
        {  
            public void run()
            {  
                obj.printTable(5);  
            }  
        };  
      
        
        System.out.println("----------------------------------");
        t1.start();
         
    }  
}

class Synchronization
{  
    synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {  
            System.out.print(" "+n*i);  
            try
            {  
                Thread.sleep(400);  
            }
            catch(Exception e) 
            {
                System.out.println(e);
            }  
        }
        System.out.println();
        System.out.println("----------------------------------");
    }  
}  
  