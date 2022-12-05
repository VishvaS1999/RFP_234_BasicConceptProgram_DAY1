public class StaticVariable_Method_Block_P6
{
    static int a=5;  //Static Variable
    static void add(int b)  //Static Method
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static  //Static Block code
    {
        System.out.println("Static Block is : ");
        a= a * 4;
    }
    public static void main(String[] args)
    {
        add(10); //method call
    }
}
