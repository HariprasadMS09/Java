package Strings.Methods;

public class format
{
    public static void main(String[] args) 
    {
        String txt="The cost of %s is : %d";
        System.out.println(txt.format(txt,"java",15000));    
    }    
}
