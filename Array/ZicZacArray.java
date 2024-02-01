class ZicZacArray
{
  public static void main(String args[])
  {
     int a[][] = new int[5][10];
      
      for (int r=0 ; r<5 ; r++)
       {
        
          for(int c=0 ; c<10 ; c++)
           {
             System.out.print(a[r][c] + " ");
           }
           System.out.println();
       }
       System.out.println("****************************");
     
      int b[][] = new int[5][];     //for zic zac 'column is empty'
          b[0] = new int[10];
          b[1] = new int[5];
          b[2] = new int[8];
          b[3] = new int[13];
          b[4] = new int[6];

          for(int r=0 ; r<5 ; r++)
           {
             for(int c=0 ; c<b[r].length ; c++)
              {
                 System.out.print(b[r][c] + " ");
              }
                System.out.println();
           }
     }
}