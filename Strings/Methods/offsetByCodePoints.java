package Strings.Methods;

public class offsetByCodePoints 
{
    public static void main(String[] args) 
    {
        String myStr = "Hello, World!";
        int result = myStr.offsetByCodePoints(3, 2);
        System.out.println(result);
    }
}
