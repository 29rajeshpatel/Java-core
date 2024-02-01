class Student 
{
   private int marks;                 // instance variable
   public void setMarks(int marks)     // local variable
    {
       this.marks = marks;
    }

    public Student greaterMarks(Student x)
    {
        if(x.marks > this.marks)
         {
           return x;
         }
         else
         {
           return this;
         } 
     }
    public void getMarks()
    {
      System.out.println("Marks = " + marks);
    }
}

class ThisFunction
{
   public static void main(String args[])
    {
      Student raj = new Student();
       raj.setMarks(110);
       raj.getMarks();
      Student patel = new Student();
      patel.setMarks(20);
      patel.getMarks();
       
      Student dev = raj.greaterMarks(patel);
      dev.getMarks();
    }
}