//Andre Verduzco
//Due: 9/22/2015
//CSE2
//hw04 Poker Hand Check
//
//first comile the program
//
//javac PokerHandCheck.java
//
//run the program
// java PokerHandCheck//
//define a class
public class PokerHandCheck{
    //main method
    public static void main (String[] args){
        
        
        int min,max;
        min=1;
        max=52;
        int card1 = (int)(Math.random()*(max+1))+min;
        int card2 = (int)(Math.random()*(max+1))+min;
        int card3 = (int)(Math.random()*(max+1))+min;
        int card4 = (int)(Math.random()*(max+1))+min;
        int card5 = (int)(Math.random()*(max+1))+min;
        //
        int suit1 = card1/13;
        int suit2 = card2/13;
        int suit3 = card3/13;
        int suit4 = card4/13;
        int suit5 = card5/13;
        //
        int type1 = card1%13;
        int type2 = card2%13;
        int type3 = card3%13;
        int type4 = card4%13;
        int type5 = card5%13;
        //
        String suits1 = "";
        String suits2 = "";
        String suits3 = "";
        String suits4 = "";
        String suits5 = "";
        //
        String cardType1 = "";
        String cardType2 = "";
        String cardType3 = "";
        String cardType4 = "";
        String cardType5 = "";
        //
        String pair = "";
        //switch
        switch(suit1){
            case 0:
                suits1="Diamonds";
                break;
                
            case 1:
                suits1="Clubs";
                break;
                
            case 2:
                suits1="Hearts";
                break;
                
            case 3:
                suits1="Spades";
                break;
        }
        
        switch(suit2){
            case 0:
                suits2="Diamonds";
                break;
                
            case 1:
                suits2="Clubs";
                break;
                
            case 2:
                suits2="Hearts";
                break;
                
            case 3:
                suits2="Spades";
                break;
        }
        
        switch(suit3){
            case 0:
                suits3="Diamonds";
                break;
                
            case 1:
                suits3="Clubs";
                break;
                
            case 2:
                suits3="Hearts";
                break;
                
            case 3:
                suits3="Spades";
                break;
        }
        
        switch(suit4){
            case 0:
                suits4="Diamonds";
                break;
                
            case 1:
                suits4="Clubs";
                break;
                
            case 2:
                suits4="Hearts";
                break;
                
            case 3:
                suits4="Spades";
                break;
        }//
        //
        switch(suit5){
            case 0:
                suits5="Diamonds";
                break;
                
            case 1:
                suits5="Clubs";
                break;
                
            case 2:
                suits5="Hearts";
                break;
                
            case 3:
                suits5="Spades";
                break;
        }
        //
        switch(type1){
            case 0:
                cardType1="2";
                break;
                
                case 1:
                cardType1="3";
                break;
                
                case 2:
                cardType1="4";
                break;
                
                case 3:
                cardType1="5";
                break;
                
                case 4:
                cardType1="6";
                break;
                
                case 5:
                cardType1="7";
                break;
                
                case 6:
                cardType1="8";
                break;
                
                case 7:
                cardType1="9";
                break;
                
                case 8:
                cardType1="10";
                break;
                
                case 9:
                cardType1="Jack";
                break;
                
                case 10:
                cardType1="Queen";
                break;
                
                case 11:
                cardType1="King";
                break;
                
                case 12:
                cardType1="Ace";
                break;
        }
        
        switch(type2){
            case 0:
                cardType2="2";
                break;
                
                case 1:
                cardType2="3";
                break;
                
                case 2:
                cardType2="4";
                break;
                
                case 3:
                cardType2="5";
                break;
                
                case 4:
                cardType2="6";
                break;
                
                case 5:
                cardType2="7";
                break;
                
                case 6:
                cardType2="8";
                break;
                
                case 7:
                cardType2="9";
                break;
                
                case 8:
                cardType2="10";
                break;
                
                case 9:
                cardType2="Jack";
                break;
                
                case 10:
                cardType2="Queen";
                break;
                
                case 11:
                cardType2="King";
                break;
                
                case 12:
                cardType2="Ace";
                break;
        }
        
        switch(type3){
            case 0: 
                cardType3="2";
                break;
                
                case 1:
                cardType3="3";
                break;
                
                case 2:
                cardType3="4";
                break;
                
                case 3:
                cardType3="5";
                break;
                
                case 4:
                cardType3="6";
                break;
                
                case 5:
                cardType3="7";
                break;
                
                case 6:
                cardType3="8";
                break;
                
                case 7:
                cardType3="9";
                break;
                
                case 8:
                cardType3="10";
                break;
                
                case 9:
                cardType3="Jack";
                break;
                
                case 10:
                cardType3="Queen";
                break;
                
                case 11:
                cardType3="King";
                break;
                
                case 12:
                cardType3="Ace";
                break;
        }
        
        switch(type4){
            case 0:
                cardType4="2";
                break;
                
                case 1:
                cardType4="3";
                break;
                
                case 2:
                cardType4="4";
                break;
                
                case 3:
                cardType4="5";
                break;
                
                case 4:
                cardType4="6";
                break;
                
                case 5:
                cardType4="7";
                break;
                
                case 6:
                cardType4="8";
                break;
                
                case 7:
                cardType4="9";
                break;
                
                case 8:
                cardType4="10";
                break;
                
                case 9:
                cardType4="Jack";
                break;
                
                case 10:
                cardType4="Queen";
                break;
                
                case 11:
                cardType4="King";
                break;
                
                case 12:
                cardType4="Ace";
                break;
        }
        
        switch(type5){
            case 0:
                cardType5="2";
                break;
                
                case 1:
                cardType5="3";
                break;
                
                case 2:
                cardType5="4";
                break;
                
                case 3:
                cardType5="5";
                break;
                
                case 4:
                cardType5="6";
                break;
                
                case 5:
                cardType5="7";
                break;
                
                case 6:
                cardType5="8";
                break;
                
                case 7:
                cardType5="9";
                break;
                
                case 8:
                cardType5="10";
                break;
                
                case 9:
                cardType5="Jack";
                break;
                
                case 10:
                cardType5="Queen";
                break;
                
                case 11:
                cardType5="King";
                break;
                
                case 12:
                cardType5="Ace";
                break;
        }
        
        int numPairs = 0;
        boolean threeOfKind = false;
        if (cardType1==cardType2){
            pair = "You have a pair";
            numPairs = numPairs + 1;
            if(cardType1 == cardType3 || cardType1 == cardType4 || cardType1 == cardType5)
                threeOfKind = true;
        }
        //removing elses
        if (cardType1==cardType3){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType1==cardType4){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType1==cardType5){
            pair="You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType2==cardType3){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType2==cardType4){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType2==cardType5){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType3==cardType4){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType3==cardType5){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        if (cardType4==cardType5){
            pair = "You have a pair";
            numPairs = numPairs +1;
        }
        //
        System.out.println("Your random cards were:");
        System.out.println("the "+cardType1+ " of "+suits1);
        System.out.println("the "+cardType2+ " of "+suits2);
        System.out.println("the "+cardType3+ " of "+suits3);
        System.out.println("the "+cardType4+ " of "+suits4);
        System.out.println("the "+cardType5+ " of "+suits5);
        
        if(threeOfKind == true){
            //print three of a kind
           //remove else 
            
            
        }
        else if (numPairs==2){
            System.out.println("You have a two pair");
        }
    
        if (numPairs==1){
            System.out.println("You have a pair");
        }
        
        if (numPairs==3){
            System.out.println("You have three of a kind");
        }
        if (numPairs==0){
            System.out.println("You have a high card hand");
        }
        
        
        //
        
    }
}