package Strings.Methods;
import java.util.*;
public class codePointAt 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = scan.nextLine();
        System.out.println(txt.codePointAt(4));
        scan.close();
    }
}
