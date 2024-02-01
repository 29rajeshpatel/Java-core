import java.util.Scanner;

class LoopDoWhile
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
       int ch;
       
      do
       {
          System.out.print("Enter Value = ");
           ch = sc.nextInt();
       }
        while(ch!=0);
     }
}