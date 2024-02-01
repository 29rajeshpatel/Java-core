class Greater_Element
{
    public static void main(String args[])
    {
      int a[] ={2,22,25,24,15,25,45};
      int g = 0;
      int x = 0;
      for(int i=0 ; i<a.length ; i++)
       {   
           if(g<a[i])
            {
               g = a[i];
               x = i;
            }
            System.out.println("a["+i+"] = " +a[i]);
       
       }
      
       System.out.println("\nGreater is = " + g + " at index a["+x+"]");
    }
}