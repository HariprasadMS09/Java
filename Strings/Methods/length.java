package Strings.Methods;

import java.util.Scanner;

public class length 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = scan.nextLine();
        System.out.println(txt.length());
        scan.close();   
    } 
}
