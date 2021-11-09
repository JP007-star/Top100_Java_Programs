import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        int firstNum=1,secondNum=1,consecutiveNum;
        System.out.print(firstNum+" "+secondNum);    //printing 0 and 1

        for(int i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            consecutiveNum=firstNum+secondNum;
            System.out.print(" "+consecutiveNum);
            firstNum=secondNum;
            secondNum=consecutiveNum;
        }
    }
}
