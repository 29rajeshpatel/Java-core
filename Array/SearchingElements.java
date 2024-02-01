import java.lang.Math;
class SearchingElements
{
    public static void main(String  args[])
    {
      int a[]={1,2,3,4,5};
      int b[]={5,7,3,9,1};
      
       boolean bn;
      
      for(int i=0; i<5; i++)
       {
          bn = false;
          for(int k=0; k<5; k++)
          {
              if(a[i] == b[k])
              {
                 bn = true;
              }
          }
          if(bn==true)
           {
              System.out.println("\nFound = " + a[i]);
            }
            else
             {
                System.out.println("\nNot Found = " + a[i]);
              }
         
       }
    }
}