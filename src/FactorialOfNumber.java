//Factorial of a number is the product of all numbers or integers which are between the range of the number and one. Or can say, factorial of an integer is the product of all the integers below it, till 1.
//
//        For 0, the factorial is 1 ;
//        For negative numbers, the factorial values are not defined.
//
//
//        In this article we will create a program to calculate the factorial of a number. For better understanding let’s consider some examples :
//
//        5 : Factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120 ,
//        7 : Factorial of 7 is 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number from user
        System.out.println("Enter a number:");
        int number=scanner.nextInt();

        //Core Logic
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
