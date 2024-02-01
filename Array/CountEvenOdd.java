class CountEvenOdd

{
  public static void main(String args[])
  {
    int a[] = {2,5,8,7,64,85,25,45,42};
    int i, even=0, odd=0;
     for(i=0; i<a.length; i++)
     {
        if(a[i]%2==0)
        {
          even++;
        }
        else
        {
         odd++;
        }
       System.out.println("a["+i+"] = " +a[i]);
     }
     System.out.println("Total Even Number = " +even);
     System.out.println("Total Odd Number = " +odd);
   }
}