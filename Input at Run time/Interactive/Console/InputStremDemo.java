import java.io.*;
 
class InputStremDemo
{
   public static void main(String args[])
   {
      try
      {
       InputStreamReader isr  = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);  
       System.out.print("Enter Value = ");
       String s1 = br.readLine();
       int a = Integer.parseInt(s1);

      
       System.out.print("Enter Value = ");
       String s2 = br.readLine();
       int b = Integer.parseInt(s2);

       int c = a+b;
       System.out.println("Add = " + c);
       }
        catch(Exception e)
         {
           System.out.println("Invalid Input must be integer type");
          }  
    }
}