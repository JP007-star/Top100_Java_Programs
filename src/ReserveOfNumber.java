import java.util.Scanner;

public class ReserveOfNumber {
    public static void main(String[] args) {

        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number:");
        int num=scanner.nextInt();

        int lastDigit=0;
        String string="";

        //Core Logic
        while(num!=0){
            lastDigit=num%10;
            string=string+Integer.toString(lastDigit);
            num/=10;
        }
        System.out.println("The Reverse of a Number is:"+string);
    }
}
