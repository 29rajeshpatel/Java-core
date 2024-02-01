import java.util.*;
class SearchArray
{ 
    public static void main(String args[])
     {
       int a[] = {21,25,45,32,65,78,98,5,4,2};
       
        for(int i=0 ; i<a.length ; i++)
        {
          System.out.println("a["+i+"] = " +a[i]);
        }
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Search Value = ");
         int n = sc.nextInt();
         int i;
         boolean bn = false;
          
         for(i=0 ; i<a.length ; i++)
         {
             if(n==a[i])
              {
                  bn = true;
                   break;
              }
         }
          if(bn==true)
          {
            System.out.println("Found at index a["+i+"] = " +n);
           }
           else
            {
               System.out.println("Not Found");
            }
     }
}