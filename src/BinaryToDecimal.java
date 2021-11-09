import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        long number=scanner.nextInt();
        System.out.println("Equivalent Binary Number is:"+binary_to_decimal(number));
    }

    private static int binary_to_decimal(long number) {
        int decimalNum=0;
        int remainder=0;  //this get remainder binary value as digits
        int digit=1;      //this to add remainder crt decimal place or base

        while (number!=0){
            remainder=(int)number%10;
            decimalNum+=remainder*digit;
            number/=10;
            digit*=2;
        }
        return decimalNum;
    }
}
