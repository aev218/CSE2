//Andre Verduzco
//Due 10/6/2015
//CSE2
//hw06 BarGraph program
import java.util.Scanner;
public class BarGraph{
    public static void main (String[] args){
        //
        
        //
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Expenses for Monday: $");
        double ExpensesForMonday = myScanner .nextDouble();
        //if myScanner .nextDouble() <0
        while(myScanner.hasNextDouble() == false){
            
        }
        ////System.out.print("Invalid. Please try again")
        System.out.print("Expenses for Tuesday: $");
        double ExpensesForTuesday = myScanner .nextDouble();
        System.out.print("Expenses for Wednesday: $");
        double ExpensesForWednesday = myScanner .nextDouble();
        System.out.print("Expenses for Thursday: $");
        double ExpensesForThursday = myScanner .nextDouble();
        System.out.print("Expenses for Friday: $");
        double ExpensesForFriday = myScanner .nextDouble();
        System.out.print("Expenses for Saturday: $");
        double ExpensesForSaturday = myScanner .nextDouble();
        System.out.print("Expenses for Sunday: $");
        double ExpensesForSunday = myScanner .nextDouble();
        //
        //*********
        //BAR GRAPH
        //*********
        //
        int a;
        System.out.print("Mon: ");
        for (a =0; a< ExpensesForMonday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.print("Tues: ");
        for (a = 0; a< ExpensesForTuesday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.print("Wed: ");
        for (a =0; a< ExpensesForWednesday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.print("Thu: ");
        for (a = 0; a< ExpensesForThursday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
       System.out.print("Fri: ");
        for (a =0; a< ExpensesForFriday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.print("Sat: ");
        for (a = 0; a< ExpensesForSaturday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.print("Sun: ");
        for (a = 0; a< ExpensesForSunday; a++){
            System.out.print("*");
        }
        System.out.println();
        //
        double averageDailyExpenses;
        double averageWeeklyExpenses;
        double averageWeeklyExpenses1;
        double weeklyPercentChange;
        double fourYearExpenditure = 0;
        averageDailyExpenses=(ExpensesForMonday+ExpensesForTuesday+ExpensesForWednesday+ExpensesForThursday+ExpensesForFriday+ExpensesForSaturday+ExpensesForSunday)/7;
        averageWeeklyExpenses= (averageDailyExpenses*7);
        ////
        
        
        //for(int i = 0; i < 52 * 4; i++){
            
            //fourYearExpenditure += //the weeks expense
        //}
        for(int i =0; i < 52 * 4; i++){
            
            int min,max;
            min=0;
            max=40;
            double percentChange = (int)(Math.random()*(max+1))+min;
            percentChange -= 20; //(-20 -> 20)
            percentChange /= 100; //(-.20 -> .20);
            averageWeeklyExpenses1=averageWeeklyExpenses * (1+percentChange);
            fourYearExpenditure += averageWeeklyExpenses1;
        }
        System.out.printf("Your average daily expenses are: $%.2f\n",averageDailyExpenses);
        System.out.printf("Estimated expenditure for 4 years: $%.2f\n",fourYearExpenditure);
        
    
}}