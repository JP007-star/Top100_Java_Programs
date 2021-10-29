import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] args) {

        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  range of num from user
        System.out.println("Enter the starting number:");
        int firstNum=scanner.nextInt();

        System.out.println("Enter the ending number:");
        int endNum=scanner.nextInt();

        //Core Logic

        System.out.println("The Prime Number in the given range are....");
        for(int i=firstNum;i<=endNum;i++){    //loop all prime number;
            int count=0;
            for(int j=1;j<=endNum;j++){        //loop for checking prime number
                if(i%j==0){
                    count++;
                }
            }
            if(count==2) System.out.println(i);
        }

    }
}
