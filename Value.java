class Value
{
   void display(int x)
 {  
    x = x+2;
   System.out.println("x = " + x);
 }

 public static void main()
 {
  int a = 45;
   display(a);
  System.out.println("a = "+ a);
 }
}