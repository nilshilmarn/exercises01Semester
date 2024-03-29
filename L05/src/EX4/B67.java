package EX4;

import java.util.Scanner;

public class B67 {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

         System.out.println("Enter amount of years: ");
         int years = input.nextInt();

        // System.out.println(futureInvestmentValue(investmentAmount, annualInterestRate / 12, years));

        printTable(investmentAmount, annualInterestRate, years);

    }


    public static double futureInvestmentValue(double investmentAmount, double montlyInterestRate, int years)
    {

        int i = 0;
        double futureValue = investmentAmount;

        double rate = montlyInterestRate / 100;

        while (i < years * 12)
        {
            // System.out.println(sum);

            futureValue += rate * futureValue;

            i++;
        }

        return futureValue;

    }

    public static void printTable(double investmentAmount, double annualInterestRate, int years)
    {

        int i = 1;

        System.out.println("Years      Future Value ");

        while (i <= years)
        {

            double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate / 12, i);

            System.out.printf("%2d            %8.2f \n", i, futureValue);

            i++;

        }

        System.out.println();


    }







}
