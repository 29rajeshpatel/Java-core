class labeledLoop
{
   public static void main(String args[])
   {
     rajesh:for(int i=1 ; i<=3 ; i++)
     {
        patel:for(int k=1 ; k<=3 ; k++)
        {
          if(k==2)
          {
           break rajesh;
          }
         System.out.println(i+" , " +k);
        }
         System.out.println("*****************");
     }
   }
}