import java.util.Scanner;
class ScanDemo1
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input the value of X = ");
      float x = sc.nextFloat();
      System.out.print("Input the value of y = ");
      float y = sc.nextFloat();
      
     float z = x + y;
     System.out.println("Value of Z = " + z);
    }
}