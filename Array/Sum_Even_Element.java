class Sum_Even_Element
{
    public static void main(String args[])
    {
      int a[] ={2,22,25,24,15};
      int sum = 0;

      for(int i=0 ; i<a.length ; i++)
       {   
           if(a[i]%2==0)
            {
               sum = sum + a[i];
            }
        
          System.out.println("a["+i+"] = " +a[i]);
       }
      
       System.out.println("\nTotal = " + sum);
    }
}