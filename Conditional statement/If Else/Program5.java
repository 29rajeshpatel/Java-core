// ternary operator

import java.util.*;

class Program5
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the value of A = ");
      int a = sc.next();

      System.out.print("Enter the value of B = ");
      int b = sc.next();

      int c = (a>b ? a:b);
      System.out.println("Greater = " + c)
    }
}
      
      