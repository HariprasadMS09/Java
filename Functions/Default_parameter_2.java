package Functions;
class Finance
{
    public void Accounting_details(String Financial_year_date, String Book_begining_date)
    {
        System.out.println("Financial year : " + Financial_year_date);
        System.out.println("Book begining date : " + Book_begining_date);
    }
    public void Accounting_details(String Financial_year_date)
    {
        Accounting_details(Financial_year_date, Financial_year_date);
    }
}
public class Default_parameter_2 
{
    public static void main(String args[])
    {
        Finance obj = new Finance();
        obj.Accounting_details("1-4-2024","23-5-2024");
    }
}
