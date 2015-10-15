//Andre Verduzco
//CSE2
//Due: 10/14/2015
//Twsity.java program
import java.util.Scanner;
public class Twisty{
    public static void main (String[]args){
        Scanner myScanner=new Scanner (System.in);
        ///
        int length=0;
        //
        boolean acceptableLength = false;
        boolean acceptableWidth = false;
        ///
        System.out.print("Input your desired length: ");
        while (!acceptableLength){
            //System.out.println("not acceptable");
            if(myScanner.hasNextInt()){
                length=myScanner.nextInt();
                //length must not exceed 80
                if(length >= 0 && length <=80){
                    acceptableLength = true;
                }
                else{
                    System.out.println("ERROR: out of range ");
                }
            }//end of scaner condition
            else{
                System.out.println("Error: please type in an integer");
                System.out.print("Input your desired length: ");
               myScanner.next();
            }
    }//end of while loop check
    
    int width=0;
    System.out.print("Input your desired width: ");
        while (!acceptableWidth){
            //System.out.println("not acceptable");
            if(myScanner.hasNextInt()){
                width = myScanner.nextInt();
                if(width >= 0 && width <= length){
                    acceptableWidth = true;
                }else{
                    System.out.println("Error: Please input an integer smaller than length ");
                }
            }
            else{
                System.out.println("Error: please type in an integer");
                System.out.print("Input your desired width: ");
                myScanner.next();
            }
    }
    ////
    int i,j;
    for(i =0; i<=width; i++){
        for ( j=0; j<=length; j++){
            if(j%width== i){  //loop to print out #
                
                System.out.print("#");
            }//else{
                //System.out.print("\\");
           // }
            //
           // if(i==j || j%width == j%width-i-1){
            if(j%width==width-i-1){
                System.out.print("/");
            }
            else{
                System.out.print(" ");
            }
    }
    System.out.println("");
    }
}//end of method
    
}//end of class

