package Strings.Methods;

public class getChars 
{
    public static void main(String[] args) 
    {
        char[] ch = {'A','p','t','e','c','h',' ','C','o','m','p','u','t','e','r',' ','E','d','u','c','a','t','i','o','n'};
        String txt = "Aptech Computer Learningg";
        System.out.print("ch before getChar : ");
        System.out.println(ch);
        txt.getChars(16,25,ch,16);
        System.out.print("ch after getChar : ");
        System.out.println(ch);
    }    
}
