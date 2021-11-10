import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  range of num from user
        System.out.println("Enter the starting number:");
        int firstNum=scanner.nextInt();

        System.out.println("Enter the ending number:");
        int endNum=scanner.nextInt();

        int remainder,sum,number,temp;
        for(int i=firstNum;i<=endNum;i++){
            number=i;
            sum=0;
          while (number!=0){
              remainder=number%10;
              sum+=remainder*remainder*remainder;
              number/=10;
          }
          if(i==sum){
              System.out.println(i);
          }
        }
    }
}
