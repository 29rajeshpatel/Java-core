// ternary operator

import java.util.*;

class Program5
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the value of A = ");
      int a = sc.nextInt();

      System.out.print("Enter the value of B = ");
      int b = sc.nextInt();

      System.out.print("Enter the value of C = ");
      int c = sc.nextInt();

      int d = (a>b ? a>c ? a : c : b>c ? b : c); //agar a,b,c ki values same hai to c else ke rupe me print hoga
     
        System.out.println("Greater = " + d);
      
    }
}
      
      