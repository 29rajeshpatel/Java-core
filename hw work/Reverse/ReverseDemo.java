import java.util.*;
 
class ReverseDemo
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 4 digit number = ");
    int num = sc.nextInt();
    
     if(num>=1000 && num<=9999)
      {
         int a = num % 10;
         int b = num / 10 % 10 ;
         int c = num / 100 % 10;
         int d = num / 1000;
         int e = a*1000 + b*100 + c*10 + d ;
          System.out.println("Reverse = " + e);
       }
       else
        {
          System.out.println("Value Must be 4 Digit");
        }
   }
}