package Strings.Methods;
import java.util.*;
public class codePointCount 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = scan.nextLine();
        System.out.println(txt.codePointCount(3, 7));
        scan.close();    
    }
}
