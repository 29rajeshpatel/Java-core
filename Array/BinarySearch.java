import java.util.Scanner;
import java.util.Arrays;

class BinarySearch
{
    public static void main(String args[])
    {
      int a[] = {5,8,9,7,12,1,15,14,16,17,18,21,22,23};

      for(int i=0 ; i<a.length ; i++)
       {
          System.out.println("a["+i+"]  = " + a[i]); 
       }
      Arrays.sort(a);

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Search Value = ");
       int srch = sc.nextInt();
   
       int first = 0;
       int last = a.length;
       int mid = 0;
       int counter = 0;

       while(first<=last)
       {
          mid = (first + last)/2;
          if(a[mid]==srch)
           {
             System.out.println("Found");
               break;
           }
           else if(srch > a[mid])
           {
               first = mid + 1; 
           }
           else if(srch < a[mid])
            { 
               last = mid - 1;
            }
             counter++;
          
       }
      
       if(first>last)
        {
           System.out.println("Not Found");
        }
        
       System.out.println("Total Iterations : " + counter);
    }
}