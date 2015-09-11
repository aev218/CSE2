//Andre Verduzco
//September 11, 2015
//CSE2
//lab03-Check
//
//Check Java Program
//
//first compile the program
//
//java Check.java
//
//The Check program will calculate the original cost of the check, the percentage tip they wish to pay,
//the number of ways the check can be split. Then determine how much each person has to pay to cover the check.
import java.util.Scanner;
//importing to use scanner class
//Main method structure
//
public class Check{
    //main Method required for every Java program
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in);
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        double checkCost = myScanner .nextDouble();
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
        
        double tipPercent = myScanner.nextDouble();
        
        tipPercent /= 100;//We want to convert the percentage into decimal value
        System.out.print("Enter number of people who went out to dinner: ");
        int numPeople = myScanner .nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
           dimes, pennies; //for storing digits
                     //to the right of decimal point 
                     //for the cost $
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost/ numPeople;
        //get the whole amount dropping the decimal fraction
        dollars = (int)costPerPerson;
        //get dimes amount,i.e.
        //(int)(6.73*10)%10->67%10->7
        //where the % (mod) operator returns the remainder
        //after the division: 583%100->83, 27%5 ->2
        dimes = (int)(costPerPerson*10) % 10;
        pennies = (int)(costPerPerson*100) %10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    }//end of main method
}//end of class