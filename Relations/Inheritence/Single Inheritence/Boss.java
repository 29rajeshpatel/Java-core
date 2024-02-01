class Animal
{
    private void dog()
    {
       System.out.println("Private Dog");
    }
    protected void rat()
    {
       System.out.println("Protected Rat");
    }
    public void cat()
    {
       System.out.println("Public Cat");
        dog();
    }
    void fox()
    {
       System.out.println("Default Fox");
    }
 }
class Zoo extends Animal
{}
class Boss
{
   public static void main(String args[])
   {
     Zoo zo = new Zoo();
        zo.rat();
        zo.cat();
        zo.fox();
       // zo.dog(); // yah direct call nahi hoga kyo ki private h
     /* Animal an = new Animal();
        
        an.rat();
        an.cat();
        an.fox();
        //an.dog(); // yah direct call nahi hoga kyo ki private h */
   }
}