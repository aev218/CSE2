//Andre Verduzco
//Due: 9/14/2015
//CSE2
//hw03 Block Program
//
//first compile the program
//
//javac Timer
//
//run the program
//Java Timer
import java.util.Scanner;
//define a class
public class Block{
//add Main Method
public static void main (String[] args) {
    Scanner myScanner = new Scanner( System.in);
    System.out.print ("Enter the length of the block: ");
     double length = myScanner .nextDouble();
    System.out.print ("Enter the width of the block: ");
     double width = myScanner .nextDouble();
    System.out.print ("Enter the height of the block: ");
     double height = myScanner .nextDouble();
     
     double surfaceArea;
     surfaceArea = (int)(2*(length*height + length*width + width*height));
     double volume;
     volume=(length*width*height);
     System.out.println("Volume of the block of dimensions " +length+" x "+width+" x "+height+" is "+ volume);
     System.out.println("Surface Area is "+ surfaceArea);
 }
}