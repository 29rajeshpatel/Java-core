import java.util.*;
 
class Program4
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
      
       if(a>b && a>c)
        {
          System.out.println("A is greater then B & C = " + a);
        }
         else if(a==b && a==c )
          {
            System.out.println("A is equals to B & C = " + a);
          }
         else if(a==b)
          {
            System.out.println("A is equals to b = " + a);
          }
         
           else if(a==c)
          { 
            System.out.println("A is equals to c = " + a);
          } 
       
        else if(b>a && b>c)
        {
          System.out.println("B is greater then A & C = " + b);
        }
         else if(b==a)
          { 
            System.out.println("B is equals to A = " + b);
          }
         
        else if(b==c)
          { 
            System.out.println("B is equals to c = " + b);
          } 
        
        else if(c>a && c>b)
         {
          System.out.println("C is greater then A & B = " + c);
         }
         
       /* else 
         {
           System.out.println("Data is not proper");
          } */
     }
}
            