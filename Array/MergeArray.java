class MergeArray
{
    public static void main(String args[])
    {
      int a[]={1,2,3,4,5};
      int b[]={6,7,8,9,10};
      int c[]=new int[10];

      for(int i=0; i<10; i++)
       {
         if(i<5)
         {
           c[i]=a[i];
         }
          else
          {
            c[i]=b[i-5];
          }
        System.out.println("values of Merge = " +c[i]);
       }
     }
}