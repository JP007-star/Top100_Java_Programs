import java.util.Scanner;

public class ToggleCharactersInString {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a string form user
        System.out.println("Enter a String:");
        String string=scanner.next();

        String resultString="";
        for (int i=0;i<string.length();i++) {
            if (Character.isUpperCase(string.charAt(i))){
                resultString+=Character.toLowerCase(string.charAt(i));
            }
            else
                resultString+=Character.toUpperCase(string.charAt(i));
        }

        System.out.println("ToggledString :"+resultString);
    }
}
