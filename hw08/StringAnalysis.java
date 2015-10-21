//Andre Verduzco
//CSE 2
//OCT 19,2015
//StringAnalysis.java program
import java.util.Scanner;
public class StringAnalysis{
    public static void main (String[] args){
        Scanner myScanner=new Scanner(System.in);
        ///Ask for a String///
        System.out.print("Please enter a string: ");
        String stringInput = myScanner.nextLine();
        System.out.print("Do you want only a certain number of chars analyzed? Enter yes or no: ");
        String stringNumChars = myScanner.nextLine();
        while(true){
            if(stringNumChars.equals("yes")||stringNumChars.equals("no")){
            break;
            }
            else{
                System.out.print("You did not enter yes or no, please try again: ");
                stringNumChars = myScanner.nextLine();
            }
        }
        
        if (stringNumChars.equals("yes")){
            System.out.print("Enter the quantity of characters you want analyzed: ");
         
            //
            while(!myScanner.hasNextInt()){
                System.out.print("Not an int, enter in a number: ");
                myScanner.next();
            }
            int chars = myScanner.nextInt();
            if (characterCheck(stringInput,chars)){
                System.out.println("Your string only contains letters");
            }
            else{
                System.out.println("Your string contains non letters");
            }
        }
            //
            //
            else{
               if(characterCheck(stringInput)){
                    System.out.println("Your string only contains letters");
                }else{
                    System.out.println("Your string contains non-letters");
                    
                }
            }
           //
            
        
        //
        
        //else if(stringNumChars.equals("no")){
          //  if (charact{
           //     System.out.print("Your string only contains letters");
                
            //}
            
        //}
     //System.out.print("evaluate");
    }
    //////////
    public static boolean characterCheck(String input, int j){
        int index = 0;
        //
        if (j >= input.length()){
            index = input.length();
        }
        else {
            index = j;
        }
        
        //
        for(int i=0; i<input.length(); i++){
            if(!Character.isLetter(input.charAt(i))){
                return false;
            }
        }
        return true;
    }
    //////////
    public static boolean characterCheck(String input){
        for(int i=0; i<input.length(); i++){
            if(!Character.isLetter(input.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
