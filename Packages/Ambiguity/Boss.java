// agar multiple packages me same name se classes hoti h to import nahi ki jati , fully quilified package name ke sath use ki jati h

// import rajesh.*; 
// import patel.*;

public class Boss
{
   public static void main(String args[])
   {
     //  abc a1 = new rajesh.abc(); 
     //  abc a2  = new patel.abc();  
   
    rajesh.abc a1 = new rajesh.abc(); // this is fully qualified path name.(package name ke sath )
    patel.abc a2  = new patel.abc();  // this is fully qualified path name.(package name ke sath )
      
       a1.add(2,4);
       a2.add(3,6);
    }
} 