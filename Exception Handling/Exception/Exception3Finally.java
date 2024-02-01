// single try with Finally.



class Exception3Finally
{
   public static void main(String args[])
   {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     
         System.out.println("\nStatement 1");

    try
      {
          int c = a/b;
          System.out.println("\nStatement 2 Divide = " + c);
      }
      finally
      {
       System.out.println("\nStatement 3 Finally");
      }   
      
         System.out.println("\nStatement 4 All Is Well");
    }
}