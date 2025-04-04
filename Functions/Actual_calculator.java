package Functions;
class Sample_fun
{
    public void fun(char op,double...a)
    {
        double sum=0;
        double diff=a[0];
        double pro=1;
        double quo=a[0];
        double rem=a[0];
        int len = a.length;
        switch(op)
        {
            case '+' : for(int i=0;i<=len-1;i++)
                        {
                            sum = sum+a[i];
                        }
                        System.out.println("Sum = "+sum);
                        break;
            case '-' : for(int i=1;i<=len-1;i++)
                       {
                            diff = diff-a[i];
                       }
                       System.out.println("Difference = "+diff);
                       break;
            case '*' : for(int i=0;i<=len-1;i++)
                        {
                            pro = pro*a[i];
                        }
                        System.out.println("Product = "+pro);
                        break;
            case '/' : for(int i=1;i<=len-1;i++)
                        {
                            if(a[i] == 0)
                            {
                                System.out.println("Error:Divide by zero");
                                break;
                            }
                            else
                            {
                                quo=quo/a[i];
                            }
                        }
                        System.out.println("Quotient ="+quo);
                        break;
            case '%' : for(int i=1;i<=len-1;i++)
                        {
                            rem = rem%a[i];
                        }
                        System.out.println("Remainder = "+rem);
                        break;
            default : System.out.println("Invalid operator");
                      break;
        }
    }
}

public class Actual_calculator 
{
    public static void main(String args[])
    {
        Sample_fun obj = new Sample_fun();
        obj.fun('%',20,5);
    }
}