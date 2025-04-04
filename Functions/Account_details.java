package Functions;
import java.util.*;
class Accounts
{
    public void Acc1()
    {
        int ac_no = 1234;
        float bal = 120000;
        System.out.println("A/c No. : " + ac_no);
        System.out.println("Balance : " + bal);
    }
    public void Acc2()
    {
        int ac_no = 5678;
        float bal = 120;
        System.out.println("A/c No. : " + ac_no);
        System.out.println("Balance : " + bal);
    }
    public void Acc3()
    {
        int ac_no = 91011;
        float bal = 5463;
        System.out.println("A/c No. : " + ac_no);
        System.out.println("Balance : " + bal);
    }
}

public class Account_details extends Accounts 
{
    public static void main(String args[])
    {
        Accounts obj = new Accounts();
        Scanner scan =  new Scanner(System.in);
        while(true)
        {
            System.out.println("Insert your card");
            int card = scan.nextInt();
            System.out.println("Enter your pin");
            int pin = scan.nextInt();
            switch(card)
            {
                case 1234 : if(pin == 11109)
                            {
                                obj.Acc1();
                                break;
                            }
                case 5678 : if(pin == 8765)
                            {
                                obj.Acc2();
                                break;
                            }
                case 91011: if(pin == 4321)
                            {
                                obj.Acc2();
                                break;
                            }
                default : System.out.println("Insert your card correctly or check your pin");
                          break;
            }
        scan.close();
        
        }
    }
}
