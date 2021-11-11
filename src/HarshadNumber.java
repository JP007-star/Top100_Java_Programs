import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number");
        int num=scanner.nextInt();

        int lastDigit=0;
        int sum=0;
        int temp=num;

        //Core Logic
        while(num!=0){
            lastDigit=num%10;
            sum+=lastDigit;
            num/=10;
        }
        if(temp % sum==0)
            System.out.println(temp+" is a Harshad Number");
        else
            System.out.println(temp+" is not a Harshad Number");
    }
}
