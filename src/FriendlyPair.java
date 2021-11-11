import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  2 numbers from user
        System.out.println("Enter the first number:");
        int firstNum=scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNum=scanner.nextInt();


        //Core Logic
        int firstFactorsSum=0;
        for (int i=1;i<firstNum;i++){
            if(firstNum %i ==0){
                firstFactorsSum+=i;
            }
        }

        int secondFactorsSum=0;
        for (int i=1;i<secondNum;i++){
            if(secondNum %i ==0){
                secondFactorsSum+=i;
            }
        }

        if(firstNum == secondFactorsSum && secondNum == firstFactorsSum){
            System.out.println(firstNum+" and "+secondNum+" are friendly pair");
        }
        else
        System.out.println(firstNum+" and "+secondNum+" are not friendly pair");
    }
}
