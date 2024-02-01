class Calculator
{
    public Calculator(int a, int b)
     {
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        System.out.println("Add = " + c);
        System.out.println("Subs = " + d);
        System.out.println("Mult = " + e);
        System.out.println("Div = " + f);
     }
}

class Constructor_Channing2
{
    public static void main(String args[])
    {
      Calculator cl = new Calculator(20,10);
    }
}