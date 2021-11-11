import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a  number from user
        System.out.println("Enter a  number:");
        int number=scanner.nextInt();

        //Core logic
        int sum=0;
        for (int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(number==sum){
            System.out.println(number+" is a perfect number..");
        }
        else
        System.out.println(number+" is not a perfect number..");

    }
}
