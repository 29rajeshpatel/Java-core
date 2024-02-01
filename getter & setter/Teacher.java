class Student
{ 
  private int roll;
  
   // setter
 public void setRoll(int x)
 {
   roll = x;
 }
 
   // getter
  public int getRoll()
  {
    return roll;
  } 

}

class Teacher 
{
  public static void main (String args[])
 {
   
   Student ob = new Student();
  //  ob.roll = 101;
  // Syatem.out.println(ob.roll);

     ob.setRoll(101);
     System.out.println("Roll Number = " + ob.getRoll());
 }
}