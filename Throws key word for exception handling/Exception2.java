import java.util.Scanner;

class AgeException extends Exception
{
     public AgeException(String msg)
     {
        super(msg);
     }
}

class Exception2
{
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Confirm your Age = ");
        int age = sc.nextInt();

        try
         {
           if(age < 18 )
            {
              throw new AgeException("Access Denied : You Are Under Age");
            }
           else
            {
              throw new AgeException("Access Granted : You Are Welcome for Vote");
            }
         }
         catch(AgeException ae)
          {
            System.out.println(ae.getMessage());
          }
    }
}
 