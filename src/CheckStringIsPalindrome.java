import java.util.Scanner;

public class CheckStringIsPalindrome {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  a string from user
        System.out.println("Enter a String:");
        String string=scanner.next();


        // Core Logic
        String resultantString="";
        for(int i=string.length()-1;i>=0;i--){
            resultantString+=string.charAt(i);
        }
        if(string.equals(resultantString)){
            System.out.println("The given string is a palindrome");
        }
        else
            System.out.println("The given string is not a palindrome");

    }
}
