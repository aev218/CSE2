//Andre Verduzco
//Due 10/6/2015
//CSE2
//hw06 CheckDigit program
import java.util.Scanner;
public class CheckDigitt{
    public static void main (String[] args){
        Scanner myScanner=new Scanner(System.in);
        boolean ISBNvalid=true;
        String ISBN;
        int digit;
        String checkSum = "";
        
        do{
            System.out.println("Please enter a 10 digit barcode: ");
            ISBN = myScanner.nextLine();
            
              if(ISBN.length()!=10){
                  System.out.print("This is NOT a valid ISBN.");
                  ISBNvalid=false;
                  continue;
              } else{
                  ISBNvalid = true;
              }
        } while(!ISBNvalid);
        
        if(ISBN.length()==10){
            int sum = 0;
            for (int i =0; i <9; i++){
                digit = Integer.parseInt(ISBN.substring(i, i+ 1));
                sum += ((10-i)*digit);
            }
            checkSum = Integer.toString((11-(sum%11)) %11);
            if("10".equals(checkSum)){
                checkSum = "X";
            }
        }
        boolean checkVerify = (checkSum.equals(ISBN.substring(9)));
         if(checkVerify==false){
             System.out.println("This is NOT a valid ISBN. Check digit should be "+ checkSum);
         } else if (checkVerify==true){
             System.out.println("This is a valid ISBN.");
         }
    }
}
         
