package Functions;
import java.util.Scanner;

class greetingTo{
    void toPapa(){
        System.out.println("Good morning! papa.");
    }
    void tofriend(){
        System.out.println("Good morning! Buddy. What's up");
    }
    void toGf(){
        System.out.println("Good morning Babe. Love u");
    }
}

public class Greeting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        greetingTo obj = new greetingTo();

        System.out.println("To whome u want to greet?\nChoose num btw 1-3");
        int opt = scan.nextInt();

        if(opt == 1){
            obj.toPapa();
        }else if(opt == 2){
            obj.tofriend();
        }else{
            obj.toGf();
        }

        scan.close();
    }
}