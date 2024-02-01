// copy constructor  is used to copy one object into another object

class Student
{
   private int roll;
   
   public Student()
   {}

   public Student(int x)     // parameterized constructor
   {
      roll = x;
   }
   
   public Student(Student ob)    // copy constructor
   {
     roll = ob.roll;
   }

    public void getRoll()
    {
      System.out.println("Roll = " + roll);
  
    }
}

class CopyConstructor
{
   public static void main(String args[])
   {
     Student s1 = new Student(101);
     Student s2 = new Student(s1);

     s1.getRoll();
     s2.getRoll();
  }
}