class SumOfArray
{
    public static void main(String args[])
    {
      int a[] ={2,22,25,24,15};
      int sum = 0;

      for(int i=0 ; i<a.length ; i++)
       {
          
          sum = sum + a[i];
          System.out.println("a["+i+"] = " +a[i]);
       }
      
       System.out.println("\nTotal = " + sum);
    }
}