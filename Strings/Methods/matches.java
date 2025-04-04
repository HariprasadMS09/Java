package Strings.Methods;

import java.util.Scanner;

public class matches 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String txt = "Aptech|Computer|Education" ;
        // System.out.println("Enter a text"); //you can also take the input from the user
        // String txt = scan.nextLine();
        System.out.println("Computer".matches(txt));;
        scan.close();    
    }
}
