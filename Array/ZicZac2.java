import java.util.Scanner;
  
class ZicZac2
{
   public static void main(String args[])
   {
     String name[] = new String[5];
      
     Scanner sc = new Scanner(System.in);

     for(int i=0 ; i<5 ; i++)
      {
         System.out.print("Enter Name "+i+" = ");
          name[i]=sc.nextLine();
      }
        
      for(int i=0 ; i<5 ; i++)
       {
          System.out.println("Length Given By Name "+i+" = " + name[i].length());
       }
   }
}