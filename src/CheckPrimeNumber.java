import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialization
        Scanner scanner=new Scanner(System.in);

        //prompt number from user
        System.out.println("Enter a number to check it is a prime");
        int num=scanner.nextInt();

        //Core logic
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The given number "+num+" is prime");
        }
        else{
            System.out.println("The given number "+num+" is not a prime");
        }
    }
}
