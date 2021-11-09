import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        System.out.println("Equivalent Binary Number is:"+decimal_to_binary(number));
    }

    public static  long decimal_to_binary(int number) {
        long binaryNum=0;
        int remainder=0;  //this get remainder binary value as digits
        int digit=1;      //this to add remainder crt decimal place

        while (number!=0){
          remainder=number%2;
          binaryNum+=remainder*digit;
          number/=2;
          digit*=10;
        }
        return binaryNum;
    }
}
