class Greater_Element_Minus
{
    public static void main(String args[])
    {
      int a[] ={-2,-22,-25,-24,-15,-25,-45}; // if put the values - or less then zero so you have to provide the value of "int g = a[0] " "first Index value of array"  
      int g = a[0];
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