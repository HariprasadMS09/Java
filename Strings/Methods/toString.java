package Strings.Methods;

import java.util.Scanner;

public class toString 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter a txt");
        String txt = scan.nextLine();
        System.out.println(txt.toString());
        scan.close();      
    }        
}
