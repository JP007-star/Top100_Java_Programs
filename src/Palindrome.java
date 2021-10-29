import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a string form user
        System.out.println("Enter a number or a string");
        String string=scanner.next();

        int len=string.length();
        String revString="";

        //Core Logic
        for(int i=0;i<len;i++){
            char ch=string.charAt(i);
            revString=ch+revString;
        }
        if(string.equals(revString)){
            System.out.println("The Given Number or String "+string+" is a Palindrome");
        }
        else {
            System.out.println("The Given Number or String "+revString+" is not a Palindrome");
        }
    }
}
