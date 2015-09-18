//Andre Verduzco
//CSE2
//lab04 Card Generator Program 
//
//first compile the program
//
//javac Card Generator
//
//run the program
//Java Card generator
//Program generates card for practicing magician
//class
public class CardGenerator{
    //main Method
    public static void main (String[] args) {
        int min,max;
        min=1;
        max=52;
        int cardNumber = (int)(Math.random()*(max+1))+min;
        //
        //String statements for suit and Identity of Cards
        String suit=" ";
        String IdentityOfCard=" ";
        //if statements to assign respective suit names
        //if card is between 1 and 13, listed as Diamonds
        if (cardNumber>=1 && cardNumber <=13){
            suit= "Diamonds";
        }
        
            //else, 14-26 card is listed as Clubs
            else if(cardNumber>=14 && cardNumber <=26){
                suit = "Clubs";
            }
            //
            //27 to 39 card is labeled as hearts
            else if(cardNumber>=27 && cardNumber <=39){
                suit="Hearts";
            }
            //40-52 card is labeled as Spades
            else if(cardNumber>=40 && cardNumber <=52){
                suit="Spades";
            }
        
            //switch statement used for Identity of Card
            switch(cardNumber%13){
                case 0:
                IdentityOfCard="Ace";
                break;
                
                case 1:
                IdentityOfCard="2";
                break;
                
                case 2:
                IdentityOfCard="3";
                break;
                
                case 3:
                IdentityOfCard="4";
                break;
                
                case 4:
                IdentityOfCard="5";
                break;
                
                case 5:
                IdentityOfCard="6";
                break;
                
                case 6:
                IdentityOfCard="7";
                break;
                
                case 7:
                IdentityOfCard="8";
                break;
                
                case 8:
                IdentityOfCard="9";
                break;
                
                case 9:
                IdentityOfCard="10";
                break;
                
                case 10:
                IdentityOfCard="Jack";
                break;
                
                case 11:
                IdentityOfCard="Queen";
                break;
                
                case 12:
                IdentityOfCard="King";
                break;
            }
                //Print
                System.out.println("You picked the "+IdentityOfCard+ " of "+ suit);
                    
        
                    
            
                
    
            }
            }
        
    
