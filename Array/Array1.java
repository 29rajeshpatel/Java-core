class Array1
{    
    public static void display(int x[] , char y[] , float z[])
     {
        for(int i=0 ; i<3 ; i++)
        System.out.println(x[i] +" , "+ y[i] +" , "+ z[i]);
     }
    public static void main(String args[])
     {
       int a[] = new int[3];
           a[0] = 2;
           a[1] = 3;
           a[2] = 4;     

       char c[] = new char[3];
           c[0] = 'i';
           c[1] = 'j';
           c[2] = 'k';  

       float f[] = new float[3];
           f[0] = 2.2f;
           f[1] = 3.3f;
           f[2] = 4.4f; 

         display(a,c,f);
      }
 }      