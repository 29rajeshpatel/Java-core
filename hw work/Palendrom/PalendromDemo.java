import java.util.*;

class PalendromDemo
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
       int e = a*1000 + b*100 + c*10 + d ;
       
       if(e==num)
        {
          System.out.println("It is a Palendrom Number");
        }
        else
         {
          System.out.println("It is not a Palendrom Number");
         }
      }
      else
       {
        System.out.println("Please inter 4 Digit number");
       }
   }
}

     

     