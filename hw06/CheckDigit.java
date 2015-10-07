//Andre Verduzco
//Due 10/6/2015
//CSE2
//hw06 CheckDigit program
import java.util.Scanner;
public class CheckDigit{
    public static void main (String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Please enter a ten digit barcode: ");
        //double barCode=myScanner.nextDouble();
        //System.out.print(barCode);
        String barCode = myScanner.nextLine();
        int sum=0;
        int rem=0;
        
        if (barCode.length()==10){
            for(int j = 0; j<9; j++){
                sum += (10-j)*barCode.charAt(j);
                System.out.println("j=" +  j + "barcode: "+ barCode.charAt(j));
            }
            rem = Integer.toString((11-(sum%11))%11);
            if ( "10".equals(rem)){
                rem = "X";
            }
        }
        boolean checkvalid=(rem.equals(barCode.length(9) ));
        if(checkvalid==false){
            System.out.println("This is NOT a valid ISBN. Check Digit should be" + rem);
            
        }else if(checkvalid==true){
            System.out.println("This is a valid ISBN.");
        }
            //System.out.println("sum=" + sum + " rem="+rem);
            //if(barCode.charAt(9) == 'X'){
                //if (rem==10) {
                    //System.out.print("This is a valid ISBN");
                //}
            //} //else {
                //if ((int)barCode.charAt(9)==rem) {
                     //System.out.print("This is a valid ISBN");
                    
                //}
            //}
            
        }
    }
