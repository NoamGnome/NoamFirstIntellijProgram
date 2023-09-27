import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // initial scanning
        System.out.print("What was your total bill: "); // bill
        double bill = scan.nextDouble();
        System.out.print("");

        System.out.print("What is the tip percentage: "); // tip percentage
        double tip_percentage = scan.nextInt();
        System.out.print("");

        System.out.print("how many people are there: "); // total people
        int people = scan.nextInt();
        System.out.print("");

        // variable
        double tip_amount = bill * (tip_percentage / 100);
        double total_bill = tip_amount + bill;
        double tip_per_person = tip_amount / people;
        double total_per_person = total_bill / people;

        // print statements
        System.out.print("Your total bill: ");
        System.out.format("%.2f", (total_bill + 0.005));
        System.out.println();

        System.out.print("The amount you will tip: ");
        System.out.format("%.2f", (tip_amount + 0.005));
        System.out.println();

        System.out.print("The tip per person is: ");
        System.out.format("%.2f", (tip_per_person + 0.005));
        System.out.println();

        System.out.print("the total each person needs to pay is: ");
        System.out.format("%.2f", (total_per_person + 0.005));
        System.out.println();

    }
}
