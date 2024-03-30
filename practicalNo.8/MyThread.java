/*Aim:- Rahul wants to design the concept of multithreading,execution of threads occurs in random order.
Do the necessary coding which includes suspend (),resume(),stop() method.

Author:- Nupur Kuhite
Version:- 8.0
Date:- 19/03/2024
*/

public class MyThread extends Thread
{
    int Tcount;
    MyThread(int Tcount)
    {
        this.Tcount=Tcount;
    }

    public void run()
    {
        try  
        {   
            sleep(500);  
            System.out.println("Thread No."+Tcount);    
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }    
        System.out.println();    
    }     
    public static void main(String[] argv)
    {
        
        // for(int i=0;i<10;i++){
        //     new MyThread(i+1).start();
        // }
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        
        System.out.println("Thread 1 State: "+t1.getState());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread 1 State: "+t1.getState());
        t3.suspend();
        System.out.println("Thread 3 State: "+t3.getState());
        t2.stop();
        System.out.println("Thread 2 State: "+t2.getState());
        t3.resume();

    }
    
}
