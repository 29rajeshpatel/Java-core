// Has-A relation me parent class ke  public member hi  inherit //hote hai child class me

import rajesh.abc; 

// Has-A relation
public class Boss2 extends abc
{
   public static void main(String args[])
   {
      abc ob1 = new abc();
     ob1.add(1,2);      // Success
    // ob1.minus(4,2);    // Error
    // ob1.multiply(2,3);  // Error
    // ob1.divide(6,2);   // Error
    }
} 