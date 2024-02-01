import java.io.DataInputStream;
 
class DataInputStremDemo
{
   public static void main(String args[])
   {
      try
      {
       DataInputStream dis = new DataInputStream(System.in);

       System.out.print("Enter Value = ");
       String s1 = dis.readLine();
       int a = Integer.parseInt(s1);

      
       System.out.print("Enter Value = ");
       String s2 = dis.readLine();
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