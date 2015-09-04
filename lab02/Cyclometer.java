//Andre Verduzco
//September 4, 2015
//CSE2
//lab02-Cyclometer
//Cyclometer Java Program
//
//first compile the program
//
//java Cyclometer.java
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[]args){
        int secsTrip1=480; //time in seconds it took for Trip1
        int secsTrip2=3220; //time in seconds it took for Trip2
        int countsTrip1=1561; //number of rotations for Trip1
        int countsTrip2=9037; //number of rotations for Trip2
        //our intermediate variables and output data
        double wheelDiamter=27.0, //diameter of wheel
        PI=3.14159, //value PI is equal to
        feetPerMile=5280, //amount of feet equivalent to 1 mile
        inchesPerFoot=12, //amount of inches equivalent to 1 foot
        secondsPerMinute=60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;//
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts. "); //time traveled in minutes
        //run calculations; store values
        //Measuring time for distance traveled
        //
        //
        distanceTrip1=countsTrip1*wheelDiamter*PI;
        //the calculation above gives the distance in inches
        //(for each count, a rotation of the wheel travels
        //the diamter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives  distance in miles
        distanceTrip2=countsTrip2*wheelDiamter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2; 
        //Print out the output data
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts. "); //time traveled in minutes
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //distance in miles
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //distance in miles
        System.out.println("The total distance was"+totalDistance+" miles"); //total distance
        
    }// end of main method
}//end of class