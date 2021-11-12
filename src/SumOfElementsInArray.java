import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a length form user
        System.out.println("Enter the length of Array:");
        int arrayLength=scanner.nextInt();

        //
        int array[]=new int[200];
        System.out.println("Enter the elements in Array");
        for(int i=0;i<arrayLength;i++){
            array[i]=scanner.nextInt();
        }

        int sum=0;
        for (int i=0;i<=arrayLength;i++){
            sum+=i;
        }
        System.out.println("Sum of Elements In Array:"+sum);
    }
}
