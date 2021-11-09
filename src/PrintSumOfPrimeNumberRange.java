import java.util.Scanner;

public class PrintSumOfPrimeNumberRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number of range:");
        int n=scanner.nextInt();
        System.out.println("Enter the last number of range:");
        int m=scanner.nextInt();
        int sum=0;
        System.out.println("Prime Numbers are:...");
        for (int i=n;i<=m;i++) {
            int count=0;
            for (int j=1;j<=m;j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("Sum of Prime Numbers is:"+sum);

    }
}
