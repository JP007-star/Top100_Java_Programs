import java.util.Scanner;

public class FirstSequenceOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        int firstNum=1,secondNum=2,consecutiveNum,nextNum;
        System.out.print(firstNum+" "+secondNum);    //printing 0 and 1

        for(int i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            consecutiveNum=firstNum+3;
            nextNum=secondNum+4;
            System.out.print(" "+consecutiveNum);
            System.out.print(" "+nextNum);
            firstNum=consecutiveNum;
            secondNum=nextNum;
        }
    }
}
