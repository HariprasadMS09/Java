package Strings.Methods;

public class regionMatches 
{
    public static void main(String[] args) 
    {
        String myStr1 = "Aptech Computer Education";
        String myStr2 = "Aptech Computer Learning";
        System.out.println(myStr1.regionMatches(0, myStr2, 0, 14));
        System.out.println(myStr1.regionMatches(16, myStr2, 16, 9));
    }       
}
