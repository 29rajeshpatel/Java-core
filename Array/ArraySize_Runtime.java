import java.util.*;

class ArraySize_Runtime
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array = ");
        int sz = sc.nextInt();
     
        int a[] = new int[sz];
         
        for(int i=0 ; i<sz ; i++)
         {
            System.out.print("Enter Value = ");
             a[i] = sc.nextInt();
         }
     }
}