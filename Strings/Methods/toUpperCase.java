package Strings.Methods;

import java.util.Scanner;

public class toUpperCase 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter a txt in lower case");
        String txt = scan.nextLine();
        System.out.println(txt.toUpperCase());
        scan.close();      
    }        
}
