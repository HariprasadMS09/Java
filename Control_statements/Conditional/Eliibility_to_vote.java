package Control_statements.Conditional;
import java.util.*;
public class Eliibility_to_vote
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are  not eligible to vote");
        }
        scan.close();
    }
}
