import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a base number:");
        int number=scanner.nextInt();
        System.out.println("Enter a power:");
        int powerOfNumber=scanner.nextInt();
        int result=1;
        while (powerOfNumber!=0){
            result *= number;
            powerOfNumber--;
        }
        System.out.println("Power of a number"+result);
    }
}
