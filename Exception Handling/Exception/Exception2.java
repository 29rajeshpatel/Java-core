class Exception2
{
   public static void main(String args[])
   {
     try
     {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     int i = Integer.parseInt(args[2]);

     int z[] = {4,5,6,7,8,9};
     try
     {
       int c = a/b;
       System.out.println("\nDivide = " + c);
     }
     catch(ArithmeticException ae)
     {
       System.out.println("\nDivided By Zero Is Not Possible");
     }
     try
     {
       System.out.println("\nArray = " + z[i]); 
     }
     catch(ArrayIndexOutOfBoundsException ae)
     {
       System.out.println("\nSorry ! Array index out of Range");
     }
    }
     catch(NumberFormatException ne)
     {
       System.out.println("\nOop's Invalid Input Type , Must Be Integer Type.");
     }
      
      System.out.println("\nAll Is Well");
    }
}