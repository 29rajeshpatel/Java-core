import java.util.*;

class SumOfDigitDemo
{
   public static void main (String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the 4 Digit Number = ");
     int num = sc.nextInt();

     if(num>=1000 && num<=9999)
     {
       int a = num % 10;
       int b = num / 10 % 10;
       int c = num / 100 % 10;
       int d = num / 1000;
       int e = a + b + c + d ;
        System.out.println("Sum = " + e);
      }
      else
       {
        System.out.println("Please inter 4 Digit number");
       }
   }
}

     

     