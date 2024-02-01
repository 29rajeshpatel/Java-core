import java.util.Scanner;

class Switch1
{
     public static void main(String args[])
     {
        int a,b,c;
        
       Scanner sc = new Scanner(System.in);

       System.out.println("Press 1 for Add");
       System.out.println("Press 2 for Minus");
       System.out.println("Press 3 for Swap");
       System.out.println("Enter your choice = ");

       int ch = sc.nextInt();

       switch(ch)
        {
           case 1:
           System.out.print("Enter 1 Number = ");
            a = sc.nextInt();

            System.out.print("Enter 2 Number = ");
            b = sc.nextInt();
        
            c = a+b;
            System.out.println("Add = " + c);

        break;

           case 2:
        
           System.out.print("Enter 1 Number = ");
            a = sc.nextInt();

            System.out.print("Enter 2 Number = ");
            b = sc.nextInt();
        
            c = a-b;
            System.out.println("Minus = " + c);
        
        break;
        
         case 3:
        
           System.out.print("Enter a Number = ");
            a = sc.nextInt();

            System.out.print("Enter b Number = ");
            b = sc.nextInt();
        
            c = a;   // a= a+b; // a=a*b; //for swap
            a = b;   // b= a-b; // b=a/b;
            b = c;   // a= a-b; // a=a/b;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
       
        break;

        default:
          
            System.out.println("Sorry! it is invalid choice");
          }
      }
}

           
