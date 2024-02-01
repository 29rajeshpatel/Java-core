class Array2D
{
   public static void main(String args[])
   {
      int a[][] = new int[3][3];
       a[0][0] = 41;
       a[0][1] = 42;
       a[0][2] = 43;
       a[1][0] = 44;
       a[1][1] = 45;
       a[1][2] = 52;
       a[2][0] = 65;
       a[2][1] = 33;
       a[2][2] = 11;

       for(int r=0 ; r<3 ; r++)
        {
           for(int c=0 ; c<3 ; c++)
             {
                System.out.print(a[r][c] + " ");
             }
                System.out.println();
         }
    }
}