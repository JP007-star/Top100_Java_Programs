import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  2 numbers from user
        System.out.println("Enter the first number:");
        int firstNum=scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNum=scanner.nextInt();

        int i=1;

        int greaterNum=0;
        if(firstNum>secondNum)
            greaterNum=firstNum;
        else
            greaterNum=secondNum;
        for(i=greaterNum;i<=firstNum*secondNum;i+=greaterNum){
            System.out.println(i);
            if(i%firstNum==0 && i%secondNum==0)
                break;
        }
        System.out.println("LCM of "+firstNum+" and "+secondNum+" is :"+i);
    }
}
