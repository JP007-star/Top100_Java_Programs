import java.util.Scanner;

public class SumOfNumbersWithGivenRange {
    public static void main(String[] args) {

        //Scanner Object initialized
        Scanner scanner=new Scanner(System.in);

        //prompting range in a variable
        System.out.println("Enter first number of range:");
        int startNum=scanner.nextInt();
        System.out.println("Enter last number of range:");
        int endNum=scanner.nextInt();
        int sum=0;

        //Core Logic
        for(int i=startNum;i<=endNum;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of numbers from "+startNum+" to "+endNum+" :"+sum);
    }
}
