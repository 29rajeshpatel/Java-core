import java.util.*;
class SearchCountArray
{ 
    public static void main(String args[])
     {
       int a[] = {21,25,45,32,65,78,98,5,4,2,32,45,32,78,2,2};
       
        for(int i=0 ; i<a.length ; i++)
        {
          System.out.println("a["+i+"] = " +a[i]);
        }
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Search Value = ");
         int n = sc.nextInt();
         int i, count=0;
         boolean bn = false;
          
         for(i=0 ; i<a.length ; i++)
         {
             if(n==a[i])
              {
                  bn = true;
                   count++;
               System.out.println("Found at index a["+i+"] = " +n);
              }
         }
          if(bn==true)
          {
            System.out.println("Total = " + count + " Times ");
           } 
           else
            {
               System.out.println("Not Found");
            }
     }
}