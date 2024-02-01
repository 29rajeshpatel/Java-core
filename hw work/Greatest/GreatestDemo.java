import java.util.*;

class GreatestDemo
{
  public static void main(String arg[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 5 Digit Number");
      int num = sc.nextInt();
      
      if(num>=10000 && num<=99999)
       {
         int a = num % 10;
         int b = num / 10 % 10;
         int c = num / 100 % 10;
         int d = num / 1000 %10;
         int e = num / 10000;
         int f = 0;
         if(a>b && a>c && a>d && a>e)
          {
             f = a;
          }
          else if(b>a && b>c && b>d && b>e)
          {
             f = b;
          }
          else if(c>a && c>b && c>d && c>e)
          {
             f = c;
          }
          else if(d>a && d>b && d>c && d>e)
          {
             f = d;
          }
          else 
          {
             f = e;
          }
           System.out.println("Greatest = " + f);
        }
        else 
         {
           System.out.println("Please, Must be Enter 5 Digit Number");
         }
       
     }
 }

      
   