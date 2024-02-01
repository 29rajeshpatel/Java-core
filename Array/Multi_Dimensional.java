class Multi_Dimensional
{
  public static void main(String args[])
  {
    int a[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12,},{13,14,15,},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};
    
     for(int b=0 ; b<3 ; b++)
     {
        for(int c=0 ; c<3 ; c++)
         
           {
             for(int d=0 ; d<3 ; d++)
              
              {
                System.out.print(a[b][c][d] + " ");
              }
                System.out.println("");
            }
          System.out.println("\n");
     }
  }
}