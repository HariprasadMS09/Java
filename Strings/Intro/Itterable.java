package Strings.Intro;
import java.util.Scanner;
public class Itterable 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = scan.nextLine();
        int len = txt.length();
        for(int i=0;i<len;i++)
        {
            System.out.println("txt[" + i + "] : " + txt.charAt(i));
        } 
        scan.close();
    }   
}
