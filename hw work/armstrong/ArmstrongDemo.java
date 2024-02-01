import java.util.*;

class ArmstrongDemo
{
   public static void main (String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 3 Digit Number");
     int num = sc.nextInt();

     if(num>=100 && num<=999)
     {
       int a = num % 10;
       int b = num / 10 % 10;
       int c = num / 100;
       int d = a*a*a + b*b*b + c*c*c ;
       
       if(d==num)
        {
          System.out.println("It is an Armstrong Number");
        }
        else
         {
          System.out.println("It is not an Armstrong Number");
         }
      }
      else
       {
        System.out.println("Please inter 3 Digit number");
       }
   }
}

     

     