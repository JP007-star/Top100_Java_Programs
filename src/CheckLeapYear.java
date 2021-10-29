import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        //Declaration of Scanner Obj
        Scanner scanner=new Scanner(System.in);

        //prompt year from the user
        System.out.println("Enter Any Year to check for Leap Year");
        int year=scanner.nextInt();

        if((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println("The Given year "+year+" is a Leap year");
        }
        else{
            System.out.println("The Given year "+year+" is not a Leap year");
        }

    }
}
