//Andre Verduzco
//Due: September 8, 2015
//CSE2
//hw02 Arithmetic Calculations
//Arithmetic Calculations Java Program
//
//first compile the program
//
//javac Arithmetic
//
//run the program
// Java Arithemetic//

//define a class

public class Arithmetic{
    
//add Main Method
public static void main (String[] args) {
//Numbe pair of socks
int nSocks=3;
//Cost per pair of socks
//('$' is part of the variable name)
double sockCost$=2.58;
//total cost of socks
double totalSockCost$=sockCost$*nSocks;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
//total cost of Glasses
double totalGlassCost$=glassCost$*nGlasses;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
//total cost of Envelopes
double totalEnvelopeCost$=envelopeCost$*nEnvelopes;
//Pennsylvania State Tax
double taxPercent=0.06;

//tax of the Socks
//converting from double to int to double to rid #s after decimal
double totalTaxSockCost$=totalSockCost$*taxPercent;
int totalTaxSC$=(int)((totalTaxSockCost$*100));
double totalSTaxSC$=totalTaxSC$;
//tax of glasses
double totalTaxGlassCost$=totalGlassCost$*taxPercent;
int totalTaxGC$=(int)((totalTaxGlassCost$*100));
double totalSTaxGC$=totalTaxGC$;
//tax of envelopes
double totalTaxEnvelopeCost$=totalEnvelopeCost$*taxPercent;
int totalTaxEC$=(int)((totalTaxEnvelopeCost$*100));
double totalSTaxEC$=totalTaxEC$;

//total of items before tax
double totalCost$=(totalSockCost$+totalGlassCost$+totalTaxEnvelopeCost$);
int totalC$=(int)((totalCost$*100));
double totalCC$=totalC$;
//total of items plus their respective taxes
double totalTaxCost$=(totalSockCost$+totalTaxSockCost$+totalGlassCost$+totalTaxGlassCost$+totalEnvelopeCost$+totalTaxEnvelopeCost$);
int totalTC$=(int)((totalTaxCost$*100));
double totalTTC$=totalTC$;

System.out.println("Total cost of socks "+(totalSockCost$));
System.out.println("Total cost of glass "+(totalGlassCost$));
System.out.println("Total cost of envelopes "+(totalEnvelopeCost$));
System.out.println("Total tax cost of socks "+((totalSTaxSC$)/100));
System.out.println("Total tax cost of glass "+((totalSTaxGC$)/100));
System.out.println("Total tax cost of envelopes "+((totalSTaxEC$)/100));
System.out.println("Total cost of items before tax "+((totalCC$)/100));
System.out.println("Total cost of items after tax "+((totalTTC$)/100));
    
}

}