package Strings.Methods;
import java.util.Scanner;
public class join 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt1 = scan.nextLine();
        System.out.println("Enter a text");
        String txt2 = scan.nextLine();
        txt1 = txt1.join(txt2);
        System.out.println(txt1);  
        scan.close(); 
    }    
}
