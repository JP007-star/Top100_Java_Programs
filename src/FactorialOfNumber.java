import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        if(number>0) {
            int fact=1;
            for (int i = 1; i <= number; i++) {
                 fact*=i;
            }
            System.out.println("Factorial of "+number+" is :"+fact);
        }
        else if(number==0){
            System.out.println("Factorial of "+number+" is : 1");
        }
        else
            System.out.println("Factorial of a negative number is not possible... ");
    }
}
