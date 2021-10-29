import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {

        //Scanner Object initialization
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a first Number :");
        int firstNum= scanner.nextInt();

        System.out.println("Enter a second Number :");
        int secondNum= scanner.nextInt();

        System.out.println("Enter a third Number :");
        int thirdNum= scanner.nextInt();

        //Core Logic
        if(firstNum>secondNum && firstNum>thirdNum){
            System.out.println("The Given Two Numbers "+firstNum+" is Greatest");
        }
        else if (secondNum>firstNum && secondNum>thirdNum){
            System.out.println("The Given Number "+secondNum+" is Greatest");
        }
        else if (thirdNum>firstNum && thirdNum>secondNum){
            System.out.println("The Given Number "+thirdNum+" is Greatest");
        }
        else{
            System.out.println("The Given Numbers all are equal...");
        }
    }
}
