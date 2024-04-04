/*Aim:- Practical No. 1
Author:- Nupur Y. Kuhite
Version:- 1.0
Date:- 30 Jan 2024
*/

class PracticalNo1
{
    public static void main(String []argv)
    {
        CompanyData SBJIT = new CompanyData("Nupur Kuhite",19,"Male",26);
        SBJIT.display();
    }
}

class CompanyData
{
    String name;
    int age;
    String gender;
    int empid;

    CompanyData()
    {
        System.out.println("Inside Default Constructor");
    }

    CompanyData(String nm,int ag,String gen,int id)
    {
        this.name=nm;
        this.age=ag;
        this.gender=gen;
        this.empid=id;

        System.out.println("Inside Para. Constructor");

    }

    public void display()
    {
        System.out.println("Name-> "+this.name+" ,Age-> "+this.age+" ,Gender-> "+this.gender+" ,Emp ID-> "+this.empid);
    }
}