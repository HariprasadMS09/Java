package Strings.Methods;
import java.util.Scanner;
public class subSequence 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter a txt");
        String txt = scan.nextLine();
        System.out.println(txt.subSequence(5,10));
        scan.close();  
    }    
}
