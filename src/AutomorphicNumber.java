import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //Prompt a number form user
        System.out.println("Enter a number:");
        int num=scanner.nextInt();

        //Core logic
        int square=num*num;
        String squareString=Integer.toString(square);
        int squareLength=squareString.length();

        String numString=Integer.toString(num);
        int numLength=numString.length();


        String result=squareString.substring(squareLength-numLength);

        if(result.equals(numString))
            System.out.println(num+" is a Automorphic Number");
        else
            System.out.println(num+" is not a Automorphic Number");


    }

}
