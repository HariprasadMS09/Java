package Strings.Methods;
import java.util.*;
public class codePointBefore 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = scan.nextLine();
        System.out.println(txt.codePointBefore(6)); 
        scan.close();           
    }
}
