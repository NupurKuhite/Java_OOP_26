/*Aim:-Create a class Emerging_Technologie forHierarchical inheritance, from a single parent
class (Emerging_Technologie),inheriting multiple child classes such as class AIML, class
AIDS, and class CSE.
Author:- Nupur Kuhite
Version:- 5.0
Date:- 27/02/24 */



class Emerging_Technologie 
{
    private String prname;
    private String vprname;

    public Emerging_Technologie(String pr, String vpr ) 
    {
        this.prname = pr;
        this.vprname = vpr;
    }

    public void forum() 
    {
        System.out.println("President: " + prname);
        System.out.println("Vice President: " + vprname);
    }
}


class AIML extends Emerging_Technologie 
{
    private String cr;

    public AIML(String name,String vname) 
    {
        super(name,vname);
        this.cr = "Sarayu";
    }

    public void forum() 
    {
        System.out.println("AIML: ");
        super.forum();
        System.out.println("Class Representative: " + cr );
    }
}


class AIDS extends Emerging_Technologie 
{
    private String crn;

    public AIDS(String name,String vname) 
    {
        super(name,vname);
        this.crn = "Mayank";
    }


    public void forum() 
    {
        System.out.println("AIDS: ");
        super.forum();
        System.out.println("Class Representation: " + crn);
    }
}

public class PracticalNo5 
{
    public static void main(String[] args) 
    {
        AIML aimlTech = new AIML("Pranay","Sarthak" );
        AIDS aidsTech = new AIDS("Nupur Kuhite", "Himanshu Talekar");
        
        System.out.println();
        System.out.println("Emerging Technologies: ");
        Emerging_Technologie EM = new Emerging_Technologie("Himanshi","Himanshu");
        EM.forum();

        System.out.println();
        aimlTech.forum();

        System.out.println();
        aidsTech.forum();
    }
}
