import java.util.Scanner;

public class RemoveVowelString {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  2 numbers from user
        System.out.println("Enter a String:");
        String string=scanner.next();

        //Core Logic
        String resultantString="";
        resultantString=string.replaceAll("[aeiou]","");
        System.out.println("String after removing Vowels :"+resultantString);
    }
}
