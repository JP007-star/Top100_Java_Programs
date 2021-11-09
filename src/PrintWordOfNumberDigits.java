import java.util.Scanner;

public class PrintWordOfNumberDigits {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        System.out.println("The Words of Numbers in Digits are:");
        System.out.println(printWordsOfNumber(number));

    }
    private static String printWordsOfNumber(int number) {
        String digit[] = { "Zero", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine" };
        int remainder=0;
        String word="";
        String reverseString="";
        int reverseNumber=0;
        while (number!=0){
            remainder=number%10;
            reverseString=reverseString+Integer.toString(remainder);
            number/=10;
        }
        reverseNumber=Integer.parseInt(reverseString);
        while(reverseNumber!=0){
            remainder=reverseNumber%10;
            reverseNumber/=10;
            word+=digit[remainder];
        }

        return word.trim();
    }
}
