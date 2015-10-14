//Andre Verduzco
//CSE2
//Oct 9, 2015
//Encypted.java program
import java.util.Scanner;
public class encrypted_x{
    public static void main (String[]args){
        Scanner myScanner=new Scanner (System.in);
        ////
        int myInput = 0;
        boolean acceptable = false;
        ///
        System.out.print("Please enter an input between 0 and 100: ");
        while (!acceptable){
            //System.out.println("not acceptable");
            if(myScanner.hasNextInt()){
                myInput=myScanner.nextInt();
                if(myInput >= 0 && myInput <=100){
                    acceptable = true;
                }else{
                    System.out.println("ERROR: out of range ");
                }
                
            }
            else{
                System.out.println("ERROR: need a int");
                System.out.print("Input your int:");
                myScanner.next();
                
            }
          //outer loop determines how many lines will be printed out
          for(int i=0; i<=myInput; i++){
              //i is counter for line number
              //inner loop determines what will be printed in each line
             for(int j=0; j<=myInput; j++ ){
                 //j is counter for number of elements in line
                 if(i==j || i==(myInput-j)){
                     System.out.print(" ");
                 }
                 
                     else {
                         System.out.print("*");
                     }
                 }
                
             
            System.out.println(" ");
          }
        }}
    }
