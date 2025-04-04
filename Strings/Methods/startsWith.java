package Strings.Methods;
import java.util.Scanner;
public class startsWith 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a txt");
        String txt = scan.nextLine();
        System.err.println("Enter a character or a word");
        String word = scan.nextLine();
        System.out.println(txt.startsWith(word));
        scan.close();   
    }    
}
