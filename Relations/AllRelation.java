class abc
{
   public void add(int x , int y)
   {
      int z = x+y;
      System.out.println("Add = " +z);
   }
}

// IS-A (Logically)

class xyz extends abc
 {}

// Has-A (Physically)

class mno
{
   abc aa = new abc();
}

// Uses-A (Physically)

class pqr
{
  public void display(int x , int y)
  {
      abc aa = new abc();
      aa.add(x,y);
   }
}

class AllRelation
{
   public static void main(String args[])
    {
      xyz xx = new xyz();
       xx.add(1,2);
    
      mno mn = new mno();
      mn.aa.add(2,4);

      pqr pq = new pqr();
      pq.display(2,4);
    }
}