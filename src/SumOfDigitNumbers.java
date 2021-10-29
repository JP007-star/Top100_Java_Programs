import java.util.Scanner;

public class SumOfDigitNumbers {
    public static void main(String[] args) {

        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number");
        int num=scanner.nextInt();

        int lastDigit=0;
        int sum=0;

        //Core Logic
        while(num!=0){
            lastDigit=num%10;
            sum+=lastDigit;
            num/=10;
        }
       System.out.println("The Sum of Given Digit of Number is:"+sum);
    }
}
