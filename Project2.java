import java.util.Scanner;

/**
 * @author (Eric Robinson)
 * @version (V 1.0 9/25/2022) 
 */
public class Project2
{
    public static void main (String args[])
    {
        P1();
        P2();
    }

    static void P1()
    {
        Scanner in=new Scanner(System.in);
        int num,num2compare,floor;
        Boolean run = true;
        
        RandomInteger object = new RandomInteger();
        num2compare=object.GiveRandom();
        floor=object.getMin(0);
        
        while(run==true)
        {
            System.out.println("enter a number between 0 and 100");
            num=in.nextInt();
            

            if(num<num2compare)
            {
                System.out.println("The number you entered is too low");
            }
            if(num>num2compare)
            {
                System.out.println("The number entered is too high");
            }
            if(num==num2compare)
            {
                System.out.println("You guessed right");
                run = false;
            }
            if(num<floor)
            {
                System.out.println("invalid number");
            }
            
        }

    }
    static void P2()
    {
        
    }

   
}
