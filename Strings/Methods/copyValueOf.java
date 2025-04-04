package Strings.Methods;

import java.util.Scanner;

public class copyValueOf
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        char[] txt1 = {'A','p','t','e','c','h'};
        String txt2 = "";
        txt2 = txt2.copyValueOf(txt1,0,2);
        System.out.println(txt2);
        scan.close();
    }    
}
