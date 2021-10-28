import java.util.Scanner;
public class PositiveOrNegativeNumber {
    public static void main(String[] args) {

        //Scanner Object initialization
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check Positive or Negative :");
        int num= scanner.nextInt();

        //Core Logic
        if(num==0){
            System.out.println("The Given Number "+num+" is Neither Positive Nor Negative");
        }
        else if (num<0){
            System.out.println("The Given Number "+num+" is Negative");
        }
        else{
            System.out.println("The Given Number "+num+" is Positive");
        }
    }
}
