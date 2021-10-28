import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        //Scanner Object initialization
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check Odd or Even :");
        int num= scanner.nextInt();

        //Core Logic
        if(num%2==0){
            System.out.println("The Given Number "+num+" is Even");
        }
        else if(num==1){
            System.out.println("The Given Number "+num+" is Neither Even Nor Odd");
        }
        else{
            System.out.println("The Given Number "+num+" is Odd");
        }
    }
}
