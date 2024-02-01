class Teacher
{
   public static void main (String args[])
    {
       Rajesh rr = new Rajesh();
       

      Patel pp = new Patel();
   
      Sing ss = new Sing();
   
     
      Arithmetic raj = rr;
       raj.area(4,5);
      
       raj = pp;
       raj.area(5,4);
   
       raj = ss;
       raj.area(6,5);
     }
}