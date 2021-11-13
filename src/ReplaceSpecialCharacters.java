import java.util.Scanner;

public class ReplaceSpecialCharacters {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt a string from user
        System.out.println("Enter a String:");
        String string=scanner.next();

        //Core Logic
        String resultantString="";
        resultantString=string.replaceAll("[^a-zA-Z]","");
        System.out.println("String after removing special Characters :"+resultantString);
    }
}
