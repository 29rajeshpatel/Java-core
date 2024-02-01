import java.util.*;

class Question2
{
     public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter any number = ");
        int a = sc.nextInt();

        if(a>0)
        {
          System.out.println("Positive");
        }
        else if(a<0)
        {
          System.out.println("Negetive");
        }
         else
        {
          System.out.println("Neutral");
        }

        System.out.println((a>0 ? "Positive" : a<0 ? "Negetive" : "Neutral"));   // using ternarry operator 
     }
}
