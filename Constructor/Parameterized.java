class Moon
{
    private int roll;
    private String name;

   public Moon (int x , String y)
   {
     roll = x;
     name = y;
   }
   
   public void display()
    {
      System.out.println("Roll No. = " + roll);
      System.out.println("Name = " + name);
    }
   
}

class Parameterized
{
   public static void main(String args[])
    {
       Moon mn = new Moon(10, "Rajesh");
         mn.display();
    }
}