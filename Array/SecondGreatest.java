
class SecondGreatest
{
    public static void main(String args[])
     {
       int a[] = {52,58,72,78,98,65,99};
       int g1 = a[0], g2 = 0;

       for(int i=1 ; i<a.length ; i++)
        {
          if(g1 < a[i])
           {
              g2 = g1;
              g1 = a[i];
           }
            else
            {
                if(g2 < a[i])
                 {
                   g2 = a[i];
                 }
            }
             System.out.println("Value of index a["+i+"] = " +a[i]);
         }
          
          System.out.println("\nFirst Greatest = " +g1);
          System.out.println("\nSecond Greatest = " +g2);
     }
}