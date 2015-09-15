//Andre Verduzco
//Due: 9/14/2015
//CSE2
//hw03 Timer Program
//
//first compile the program
//
//javac Timer
//
//run the program
//Java Timer
import java.util.Scanner;
//define a class
public class Timer{
//add Main Method
public static void main (String[] args) {
    Scanner myScanner = new Scanner( System.in);
    System.out.print("Enter the current time ");
    double currentTime = myScanner .nextDouble();
    System.out.print("Enter the dinner time ");
    double dinnerTime = myScanner .nextDouble();
    
    //time until dinner
    double timeUntilDinner;
    int HHMM, hours, minutes;
    //Calculation for time until dinner
    timeUntilDinner = dinnerTime - currentTime;
    //hours wait time
    hours = (int)(timeUntilDinner/100);
    //minutes wait time
    minutes = (int)(timeUntilDinner)%100;
    //System.out.println(("Time until dinner " + ' ' + hours + minutes));
    System.out.println("You have " +hours+ " hours and " +minutes+ " minutes until dinner");
}
    
}