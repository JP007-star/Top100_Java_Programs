import java.util.Scanner;

public class SecondSmallestElementInArray {
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

        int temp=0;
        for (int i=0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
               if(array[i]>array[j]){
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
               }
            }
        }

        System.out.println("Second Largest Element in Array:"+array[1]);
    }
}
