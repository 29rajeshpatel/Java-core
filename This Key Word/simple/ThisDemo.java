class Student 
{
   private int roll;                 // instance variable
   public void setRoll(int roll)     // local variable
    {
       this.roll = roll;
    }
  
    public void getRoll()
    {
      System.out.println("Roll = " + roll);
    }
}

class ThisDemo
{
   public static void main(String args[])
    {
      Student s1 = new Student();
       s1.setRoll(10);
       s1.getRoll();
    }
}