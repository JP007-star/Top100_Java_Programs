import java.util.Scanner;

public class AmountToWordsConverter {
    public static void main(String[] args)
    {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        number = scanner.nextInt();
        System.out.println(amountToWordsConversion(number));
    }

    public static String amountToWordsConversion(int number) {
        String numberInWords="";
        if (number<= 0)
        {
            System.out.println("Enter numbers greater than 0");
        }
        else
        {

            numberInWords+=DigitCalculator((number / 1000000000), " Hundred");
            numberInWords+=DigitCalculator((number / 10000000) % 100, " crore");
            numberInWords+=DigitCalculator(((number / 100000) % 100), " lakh");
            numberInWords+=DigitCalculator(((number / 1000) % 100), " thousand");
            numberInWords+=DigitCalculator(((number / 100) % 10), " hundred and");
            numberInWords+=DigitCalculator((number % 100), " only");
        }
        return  numberInWords.trim();
    }

    public static String DigitCalculator(int n, String digit)
    {
        String numberInWord="";
        String one[] = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                " Nineteen" };

        String ten[] = { "", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };

        if (n > 19)
        {
            numberInWord+=ten[n / 10] + " " + one[n % 10];
        }
        else
        {
            numberInWord+=one[n];
        }
        if (n > 0)
            numberInWord+=digit;
        return numberInWord;
    }
}
