package ee.taltech.itcolledge.groups;

import java.util.Scanner;

public class ProfitCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the initial investment");
        int initialInvestment = Integer.parseInt(sc.nextLine());
        System.out.println("Insert the expected return a year %");
        int percentage = Integer.parseInt(sc.nextLine());

        int returnOnInvestment = initialInvestment * percentage / 100;
        int total = initialInvestment + returnOnInvestment;
        System.out.println(String.format("You get %d money back, out of which %d is pure profit", total, returnOnInvestment));
    }
}
