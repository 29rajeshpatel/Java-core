import java.util.Scanner;

class WhileDemo
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      int ch = 1;
     
       while(ch!=0)
       {
         System.out.print("Enter the Number = ");
         ch = sc.nextInt();
       }
     }
}