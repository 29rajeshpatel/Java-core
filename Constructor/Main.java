class Student
{
      private int roll;
      private String name;
      private char section;
      private float percentage;
      private boolean result;
     
     public Student()
      {
        roll = 1;
        name = "Rajesh";
        section = 'B';
        percentage = 88;
        result = true;
      }

     public void display()
   {
      System.out.println("Roll No. = " + roll);
      System.out.println("Name = " + name);
      System.out.println("Section = " + section);
      System.out.println("Percentage = " + percentage);
      System.out.println("Result = " + result);
   }

}
 
class Main
{   
     public static void main(String args[])
      {
        Student st = new Student();
         st.display();
      }
}
  