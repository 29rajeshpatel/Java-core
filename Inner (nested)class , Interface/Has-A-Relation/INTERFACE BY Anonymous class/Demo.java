// by using Anonymous class

interface abc
{
   public void add(int x ,int y);
}

class Demo 
{
   public static void main(String args[])
    {
      abc aa = new abc()
              {
                 public void add(int x , int y)
                 {
                   System.out.println("Add  = " + (x+y));
                  }
              };
          aa.add(1,2);
      }
}