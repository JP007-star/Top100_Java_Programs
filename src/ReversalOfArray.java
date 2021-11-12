import java.util.Scanner;

public class ReversalOfArray {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a length form user
        System.out.println("Enter the length of Array:");
        int arrayLength=scanner.nextInt();

        //
        int array[]=new int[arrayLength];
        int temp;

        System.out.println("Enter the elements in Array");
        for(int i=0;i<arrayLength;i++){
            array[i]=scanner.nextInt();
        }

        for(int i=0;i<arrayLength/2;i++){
            temp=array[i];
            array[i]=array[arrayLength-1];
            array[arrayLength-1]=temp;
            arrayLength--;
        }
        System.out.println("Reversal of Elements in Array:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
