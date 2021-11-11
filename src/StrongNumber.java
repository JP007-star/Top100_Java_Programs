import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number from user
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        
        
        //Core logic
        int remainder,sum=0,fact = 0,temp=0;
        temp=number;
        while (number!=0){
            remainder=number%10;
            fact=1;
            for (int i=1;i<=remainder;i++)
                fact*=i;
            sum+=fact;
            number/=10;
        }

        if(temp==sum){
                System.out.println("The Given Number  "+temp+" is a Strong Number");
            }
            else {
                System.out.println("The Given Number  "+temp+" is a not Strong Number");
        }
    }
}
