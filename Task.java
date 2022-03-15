import java.lang.*;

public class Task {
    public static void main(String[] args) {

        System.out.println(giveChange(5.32));

    }
    public static String giveChange(double amount){
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;

        double q = amount / quarter;
        q = Math.floor(q);
        double amountQ = amount - q*quarter;

        double d = amountQ / dime;
        d = Math.floor(d);
        double amountD = amountQ - d*dime;

        double n = amountD / nickel;
        n = Math.floor(n);
        double amountN = amountD - n*nickel;

        double p = amountN / penny;
        p = Math.floor(p);
        double amountP = amountN - p+penny;

        return ("The change is " + (int)q + " quarters, " + (int)d + " dimes, " + (int)n + " nickels and " + (int)p + " pennies.");
    }
}
