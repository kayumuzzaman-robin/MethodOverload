package learn.java;

/**
 * There are two ways to overload the method in java
 * By changing number of arguments
 * By changing the data type
 */
public class App {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double feetToInch = feet * 12;
            double calcCentimeter = (feetToInch + inches) * 2.54;
            System.out.println("calcFeetAndInchesToCentimeters: centimeter is " + calcCentimeter);
            return calcCentimeter;
        } else {
            return -1;
        }
    }

    public static int calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) (inches / 12);
            int calcInch = (int) (inches % 12);
            System.out.println("calcFeetAndInchesToCentimeters: feet is " + feet + " and inches is " + calcInch);
            return feet;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading");
        // variables didn't used intentionally
        double feetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(6, 0);
        double toFeet = calcFeetAndInchesToCentimeters(100);
    }
}
