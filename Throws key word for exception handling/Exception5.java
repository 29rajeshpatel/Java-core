import java.util.Scanner;

class Exception5
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter A = ");
      int a = sc.nextInt();

      System.out.print("Enter B = ");
      int b = sc.nextInt();
     
    try
     {
      Rajesh.divide(a,b);
     }
    catch(ArithmeticException ae)
     {
       System.out.println("Divided by zero is not Possible");
     }      
      System.out.println("All Is Well");   

  }
}