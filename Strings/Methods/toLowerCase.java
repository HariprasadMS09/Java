package Strings.Methods;

import java.util.Scanner;

public class toLowerCase 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter a txt in upper case");
        String txt = scan.nextLine();
        System.out.println(txt.toLowerCase());
        scan.close();      
    }    
}
