import java.util.*;

class Question1
{
     public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter any number = ");
        int a = sc.nextInt();

        if(a%2==0)
        {
          System.out.println("Even");
        }
        else
        {
          System.out.println("Odd");
        }

        System.out.println((a%2==0 ? "Even" : "Odd"));   // using ternarry operator 
     }
}
