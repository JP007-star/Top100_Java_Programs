import java.util.Scanner;

public class HCFOfTwoNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  2 numbers from user
        System.out.println("Enter the first number:");
        int firstNum=scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNum=scanner.nextInt();

        int remainder=1;

        if(firstNum!=secondNum) {
            System.out.print("HCF of "+firstNum+" and "+secondNum+" is :");
            while (remainder != 0) {
                remainder = firstNum % secondNum;
                if (remainder != 0) {
                    firstNum = secondNum;
                    secondNum = remainder;
                }
            }
            System.out.print(secondNum);
        }
        else
            System.out.println("Both numbers are equal");

    }
}
