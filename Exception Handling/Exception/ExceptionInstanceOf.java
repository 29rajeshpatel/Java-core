// single try with single catch having multiple handler class

// instanceof operator ka use object ko check karne ke liye ki woh given // class se belong karta  hai ki nahi

class ExceptionInstanceOf
{
   public static void main(String args[])
   {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     int i = Integer.parseInt(args[2]);
     int z[] = {4,5,6,7,8,9};
     
       System.out.println("\nStatement 1");

    try
      {
          int c = a/b;
          System.out.println("\nStatement 2 Divide = " + c);
          System.out.println("\nStatement 3 Array = " + z[i]); 
          System.out.println("\nStatement 4");
      }
          catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
      {
         if(ae instanceof ArithmeticException)
          {      
            System.out.println("\nStatement 5 Divided By Zero Is Not Possible");
          }
         if(ae instanceof ArrayIndexOutOfBoundsException)
          {
            System.out.println("\nStatement 6 Sorry ! Array index out of Range");
          }
       }
      
           System.out.println("\nStatement 7 All Is Well");
    }
}