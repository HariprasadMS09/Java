package Functions;
class Inputs
{
    public void Details(String name, int age, String country)
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Country : " + country);
    }
    public void Details(String name, int age)
    {
        Details(name,age,"India");
    }
}
public class Default_parameter_1 
{
    public static void main(String args[])
    {
        Inputs obj = new Inputs();
        obj.Details("Shreya",21);
    }
}
