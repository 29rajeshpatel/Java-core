// length property

class Array_Traverse
{
   public static void main(String args[])
   {
     int a[] = { 21,22,23,24};
  
      for (int i=0 ; i<a.length ; i++)
      {
        System.out.println(a[i]);
      }
       
       System.out.println("-----------------------");
        
       for(int w : a)
        {
          System.out.println(w);
        }
   }
}