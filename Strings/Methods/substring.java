package Strings.Methods;

import java.util.Scanner;

public class substring 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter a txt");
        String txt = scan.nextLine();
        System.out.println(txt.substring(5,10));
        scan.close();  
    }        
}
