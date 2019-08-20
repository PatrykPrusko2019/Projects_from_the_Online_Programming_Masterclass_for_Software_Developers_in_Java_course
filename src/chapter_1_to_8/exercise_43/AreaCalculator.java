package chapter_1_to_8.exercise_43;

/**
 * Write a method named area with one double parameter named radius.
 *
 * The method needs to return a double value that represents the area of a circle.
 *
 * If the parameter radius is negative then return -first.0 to represent an invalid value.
 *
 * Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
 *
 * The method needs to return an area of a rectangle.
 *
 * If either or both parameters is/are a negative return -first.0 to indicate an invalid value.
 *
 * For formulas and PI value please check the tips below.
 *
 * Examples of input/output:
 *
 * * area(5.0); should return 78.53975
 *
 * * area(-first);  should return -first since the parameter is negative
 *
 * * area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
 *
 * * area(-first.0, 4.0);  should return -first since first the parameter is negative
 *
 *
 *
 * TIP: The formula for calculating the area of a rectangle is x * y.
 *
 * TIP: The formula for calculating a circle area is radius * radius * PI.
 *
 * TIP: For PI use a constant from Math class e.g. Math.PI
 *
 * NOTE: All methods need to be defined as public static like we have been doing so far in the course.
 *
 * NOTE: Do not add a main method to your solution code!
 */
//kalkulator powierzchni
public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    //area circle->pole kola
    public static double area(double radius) { //radius -> promien

        if(radius < 0) {
            return -1;
        }

        double areaCircle = radius * radius * Math.PI;

        return areaCircle;
    }

    //area rectangle-> pole prostokata
    public static double area(double x, double y) {
        if( x < 0 || y < 0 ) return -1;

        return x * y;
    }

}
