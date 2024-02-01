import java.util.Arrays;

class GreaterArrayElmnt
{
   public static void main(String args[])
   {
      int a[] = {4,6,2,7,8,9};
     
      for(int i=0 ; i<a.length ; i++)
       {
         System.out.println("a["+i+"] = " + a[i]);
       } 
       
     int z = Arrays.stream(a).max().getAsInt();
     System.out.println("Greater is = " + z);
     int y = Arrays.stream(a).min().getAsInt();
      System.out.println("Smallest is = " + y);
   }
}