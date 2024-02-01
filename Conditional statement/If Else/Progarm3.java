import java.util.*;

class Progarm3
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
       System.out.print("Enter the value of A = ");
        int a =sc.nextInt();

       System.out.print("Enter the value of B = ");
        int b =sc.nextInt();

       System.out.print("Enter the value of C = ");
        int c =sc.nextInt();

        if(a>b)
         { 
               if(a>c)
                {
                   System.out.println("A is greater " + a);
                }
                 else
                  {
                    System.out.println("C is greater " + c);
                  }
          }
          else
           {
               if(b>c)
                {
                  System.out.println("B is greater " + b);
                }
                else
                  {
                    System.out.println("C is greater " + c);
                  }
            }
         }
}
             
