/*Aim:- Alisha is assigned with the task to design a code for finding out the volume of cube, the
volume of cylinder, the volume of Box using method overloading concept. Can you
Help alisha to achieved the task

Author:- Nupur Kuhite
Version:- 3.0
Date:- 13/02/2024
*/

class Volume
{
    public Double cubeVolume(Double side)
    {
        return side * side * side;
    }

    public Double cylinderVolume(Double radius,Double height)
    {
        return Math.PI * radius * radius * height;
    }

    public Double boxVolume(Double length,Double width,Double height)
    {
        return length * width * height;
    }

}

class PracticalNo3
{
    public static void main(String [] argv)
    {
        Volume cal = new Volume();

        Double cube= cal.cubeVolume(5.0);
        System.out.println("Volume of Cube --> "+ cube);
        
        Double cylinder= cal.cylinderVolume(4.0,7.0);
        System.out.println("Volume of Cylinder --> "+ cylinder);

        Double box= cal.boxVolume(7.0,5.0,3.0);
        System.out.println("Volume of Box --> "+ box);
           
       
    }
}