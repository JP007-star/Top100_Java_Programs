import java.util.Scanner;

public class SumOfFirstNaturalNumber {
    public static void main(String[] args) {

        //Scanner Obj initialized
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number up to which you need to print natural number:");
        int num=scanner.nextInt();

        //Core Logic
        int sum=0;
        for (int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum of first "+num+" number:"+sum);
    }
}
