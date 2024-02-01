// Is-A relation me parent class ke protected and public member inherit //hote hai child class me

import rajesh.abc; 

// Is-A relation
public class Boss1 extends abc
{
   public static void main(String args[])
   {
     Boss1 ob = new Boss1();
     ob.add(1,2);      // Success
    // ob.minus(4,2);    // Error
     ob.multiply(2,3); // Success
   //  ob.divide(6,2);   // Error
    
       ob.cube(2);
    }
} 