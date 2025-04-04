package Strings.Methods;

import java.util.Scanner;

public class getBytes 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = scan.nextLine();
        int len = txt.length();
        byte[] bytes = txt.getBytes();
        for(int i =0;i<len;i++)
        {
            System.out.println(bytes[i]);  
        }
        scan.close();  
    }    
}
