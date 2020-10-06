
import java.util.Scanner;

public class PaintJob{

    public static void main(String[] args) {
        
        System.out.println("Please enter how many rooms are to be painted");
        Scanner keyboard = new Scanner(System.in);
        double noofrooms = keyboard.nextDouble();
       
        System.out.println("Please enter the total square feet of wall space to be painted");
        double wallspace = keyboard.nextDouble();
       
        System.out.println("Please enter price paid per gallon of paint");
        double price = keyboard.nextDouble();
 
        System.out.println("\nTotal gallons required is " + calculatepaintrequired (wallspace));

        System.out.println("\nTotal hours of labor required is " + calculatehours(wallspace));

        System.out.println("\nCost of paint in total is $" + calculatecost(wallspace, price));

        System.out.println("\nTotal labor charges are $" + calculatelabourcharges (wallspace));

        System.out.println("\nTotal cost of paint job is $" + finalcost (wallspace, price));
    }

    public static double calculatepaintrequired(double wallspace) {
        double gallonsRequired = (wallspace/ 115);
        return (int) gallonsRequired;
    }

    public static double calculatehours(double wallspace) {
        double hoursOfLaborRequired = (wallspace / 115) * 8;
        return (int) hoursOfLaborRequired;
    }

    public static double calculatecost (double wallspace, double price) {
        double costOfPaint = ((wallspace / 115) * price);
        return (int) costOfPaint;
    }

    public static double calculatelabourcharges (double wallspace) {
        double hoursOfLaborRequired = (wallspace / 115) * 8;
        double totalLaborCharges = hoursOfLaborRequired * 18;
        return (int) totalLaborCharges;
    }

    public static double finalcost (double wallspace, double price) {
        double costOfPaint = ((wallspace/ 115) * price);
        double hoursOfLaborRequired = (wallspace / 115) * 8;
        double totalLaborCharges = hoursOfLaborRequired * 18;
        double totalCost = costOfPaint + totalLaborCharges;
        return (int) totalCost;
    }
}