class Student
{
   String studentname;           // non-static variable will allocate individual memory with each object 
   static String collegename;    // static variable will share common memory with each object

}

class Boss 
{ 
    public static void main(String args[])
     {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

         System.out.println(s1.studentname +","+ s1.collegename);
         System.out.println(s2.studentname +","+ s2.collegename);
         System.out.println(s3.studentname +","+ s3.collegename);
          
         System.out.println("----------------------------------------");

         s1.studentname = "Rajesh";
         s1.collegename = "Truba";

         System.out.println(s1.studentname +","+ s1.collegename);
         System.out.println(s2.studentname +","+ s2.collegename);
         System.out.println(s3.studentname +","+ s3.collegename);

         System.out.println("----------------------------------------");

         s2.studentname = "Shivam";
         s2.collegename = "Medicaps";

         System.out.println(s1.studentname +","+ s1.collegename);
         System.out.println(s2.studentname +","+ s2.collegename);
         System.out.println(s3.studentname +","+ s3.collegename);
          
         System.out.println("----------------------------------------");

         s3.studentname = "Raghav";
         s3.collegename = "Veshnav viddhyalay";

         System.out.println(s1.studentname +","+ s1.collegename);
         System.out.println(s2.studentname +","+ s2.collegename);
         System.out.println(s3.studentname +","+ s3.collegename);
     }
}