import java.lang.Math;
class PowerArray
{
    public static void main(String  args[])
    {
      int a[]={1,2,3,4,5};
      int b[]={6,7,8,9,10};
      double c;
      
      for(int i=0; i<5; i++)
       {
         c = Math.pow(a[i],b[i]);
         System.out.println(c);
       }
    }
}