import java.util.*;

class Question3
{
     public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter any number = ");
        int a = sc.nextInt();

        if(a/10==0)
        {
          System.out.println("One Digite number");
        }
        else if(a/100==0)
        {
          System.out.println("Two Digite number");
        }
        else if(a/1000==0)
        {
          System.out.println("Three Digite number");
        }
         else if(a/10000==0)
        {
          System.out.println("Four Digite number");
        }
         else if(a/100000==0)
        {
          System.out.println("Five Digite number");
        }
         else
        {
          System.out.println("out of range");
        }
     }
}