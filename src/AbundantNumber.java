import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number:");
        int number=scanner.nextInt();

        //Core Logic
        int sum=0;
        for (int i=1;i<number;i++){
            if(number %i ==0){
                sum+=i;
            }
        }

        if(sum>number)
            System.out.println(number+" is a Abundant Number");
        else
            System.out.println(number+" is not a Abundant Number");
    }
}
