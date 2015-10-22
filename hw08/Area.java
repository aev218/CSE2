//Andre Verduzco
//CSE 2
//OCT 19,2015
//Stats.java program

//import scanner
import java.util.Scanner;
public class Area{
    public static void input (String in){
        double circle;
        Scanner myShape=new Scanner (System.in);
        //Scanner dimension=new Scanner (System.in);
        if (in.equals("circle")){
            System.out.println("enter radius");
            while(!myShape.hasNextDouble()){
                System.out.println("Not a double");
                myShape.next();
            
            }
            double dim = myShape.nextDouble();
            double area = circle(dim);
          
        }
        ////////////////////////////
        //Ask user for inputs if rectangle
        if(in.equals("rectangle")){
            System.out.println("Enter length");
            while(!myShape.hasNextDouble()){
                System.out.println("Not a double");
                myShape.next();
            }
            double length=myShape.nextDouble();
            System.out.println("Enter width");
            while(!myShape.hasNextDouble()){
                System.out.println("Not a double");
                myShape.next();
            }
            double dim1 = myShape.nextDouble();
            double area = rectangle(length, dim1);
        }
        /////////////////////////////
        if(in.equals("triangle")){
            System.out.println("Enter base");
            while(!myShape.hasNextDouble()){
                System.out.println("Not a double");
                myShape.next();
            }
            double base = myShape.nextDouble();
            System.out.println("Enter height");
            while(!myShape.hasNextDouble()){
                System.out.println("Not a double");
                myShape.next();
            }
            double dim2 = myShape.nextDouble();
            triangle(base, dim2);
        }
        //////////////////////////////
    
        
    }//
    public static double circle (double dim){
        double radius=dim;
        double areaC = (radius*radius)*3.14;
        System.out.println("area: " + areaC);
        return areaC;
       
    }
    //TRIANGLE//
    public static void triangle (double dim, double dim2){
        //double base=dim;
       // double height=dim2;
       System.out.print("area: "+(dim*dim2)/2);
        
    }
    //
    public static double rectangle(double dim, double dim1){
        double length=dim;
        double width=dim1;
        double areaR=(width*length);
        System.out.println("area: " + areaR);
        return areaR;
    }
        
    //}
    //
    public static void main (String [] args){
        //public static void Triangle (String [] args){
            Scanner myShape=new Scanner (System.in);
            //
            System.out.print("Choose triangle, rectangle or circle: ");
            //
            double shape;
            //shape = myShape.nextDouble();
            //
            String in = myShape.next();
            in=in.toLowerCase();
            while (true){
                if(in.equals ("circle") || in.equals("triangle") || in.equals ("rectangle")) {
                break;
                }
                else{
                System.out.print("Not an acceptable Shape. Acceptable Shapes include: Triangles, Rectangles, & Circles. Input again: ");
                in = myShape.next();
                in=in.toLowerCase();
            }
            //
            //double Triangle;
            //Triangle= ((1/2)(b*h));
        }
        input(in);
    }
}