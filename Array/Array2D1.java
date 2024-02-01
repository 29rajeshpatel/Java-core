class Array2D1
{
   public static void main(String args[])
   {
      int a[][] = { {1,2,3} , {4,5,6} , {7,8,9} }; // industry use it's way
    // int a[][] = new int[2][2];
     /* a[0][0] = 1;
      a[0][1] = 2;
      a[1][0] = 3;
      a[1][1] = 4; */

     for(int b=0 ; b<2 ; b++)
      {
        for(int c=0 ; c<2 ; c++)
         {
           System.out.print(a[b][c] + " ");
         }
          System.out.println();
      }
   }
}