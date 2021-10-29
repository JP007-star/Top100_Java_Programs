import java.util.Scanner;

public class GreatestTwoOfNumbers {
    public static void main(String[] args) {
        //Scanner Object initialization
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a first Number :");
        int firstNum= scanner.nextInt();
        System.out.println("Enter a second Number :");
        int secondNum= scanner.nextInt();

        //Core Logic
        if(firstNum==secondNum){
            System.out.println("The Given Two Numbers  are equal..");
        }
        else if (firstNum<secondNum){
            System.out.println("The Given Number "+secondNum+" is Greater");
        }
        else{
            System.out.println("The Given Number "+firstNum+" is Greater");
        }
    }
}
