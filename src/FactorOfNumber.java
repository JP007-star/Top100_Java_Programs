
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number:");
        int number=scanner.nextInt();

        //Core Logic
        System.out.println("Factors Of Numbers are:");
        for (int i=1;i<=number;i++){
            if(number %i ==0){
                System.out.print(i +" ");
            }
        }
    }
}
