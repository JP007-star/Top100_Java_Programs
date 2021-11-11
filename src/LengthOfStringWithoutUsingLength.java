import java.util.Scanner;

public class LengthOfStringWithoutUsingLength {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a String:");
        String string=scanner.next();

        //Core Logic
        int length=0;
        for(char ch:string.toCharArray()){
            length++;
        }
        System.out.println("Length of the String is:"+length);
    }
}
