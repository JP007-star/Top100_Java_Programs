import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char userChoice;
        double totalPrice=0.0;
        do {
            System.out.println("Enter the Item Code:");
            String itemCode = scanner.next();
            System.out.println("Enter the description:");
            String description = scanner.next();
            System.out.println("Enter the Quantity");
            Double quantity = scanner.nextDouble();
            System.out.println("Enter the Price");
            Double price = scanner.nextDouble();
            System.out.println("Do you Wish to continue?...");
            userChoice = scanner.next().charAt(0);
            totalPrice+=price*quantity;
        }
        while (userChoice=='y');

        if(totalPrice>10000){
            totalPrice-=totalPrice*0.1;
        }
        else if(totalPrice<1000){
            totalPrice+=totalPrice*0.025;
        }
        else {
            totalPrice=totalPrice;
        }
        System.out.println("TotalPrice:"+totalPrice);
        AmountToWordsConverter amountToWordsConverter=new AmountToWordsConverter();
        System.out.println(amountToWordsConverter.amountToWordsConversion((int) totalPrice));

    }
}
