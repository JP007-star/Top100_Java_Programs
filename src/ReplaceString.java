import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a string form user
        System.out.println("Enter a string:");
        String string=scanner.next();

        System.out.println("Enter a string to be replaced:");
        String oldString=scanner.next();

        System.out.println("Enter a string for replacing:");
        String newString=scanner.next();

        String resultantString=string.replace(oldString,newString);
        System.out.println("New String is:"+resultantString);
    }
}
