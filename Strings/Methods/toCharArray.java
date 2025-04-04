package Strings.Methods;

import java.util.Scanner;

public class toCharArray 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter a txt");
        String txt = scan.nextLine();
        char[] arr = txt.toCharArray();
        System.out.println(arr[4]);
        scan.close();  
    }        
}
