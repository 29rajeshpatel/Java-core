import java.util.Scanner;

class WhileReverse
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number = ");
      long n = sc.nextLong();
      long a = 0 , b = 0;
 
      while(n!=0)
       {
         a = n % 10;
         b = b * 10 + a;
         n = n / 10;
       }
       System.out.println("Reverse = " + b);
     }
}