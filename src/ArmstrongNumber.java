import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number:");
        int num=scanner.nextInt();

        int remainder=0;
        int sum=0;
        int temp=num;
        //Core Logic
        while(num!=0){
            remainder=num%10;
            sum=sum+(remainder*remainder*remainder);
            num/=10;
        }
        if(temp==sum){
            System.out.println("The Given Number  "+temp+" is a Armstrong Number");
        }
        else {
            System.out.println("The Given Number  "+temp+" is a not Armstrong Number");
        }
    }
}
