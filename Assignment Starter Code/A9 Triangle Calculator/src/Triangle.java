public class Triangle {
    private double sideA, sideB, sideC;

    // Default Constructor
    public Triangle() {
        changeSides(0,0,0);
    }

    // Initialization Constructor
    public Triangle(double tempA, double tempB, double tempC) {
        changeSides(tempA, tempB, tempC);
    }

    // Modifier Method to set side values
    public void changeSides(double tempA, double tempB, double tempC) {
        sideA = tempA;
        sideB = tempB;
        sideC = tempC;
    }

    // Accessor Method - view stats/data
    public void view() {
        System.out.println("The values are...Side A " + sideA + ", Side B " + sideB + ", Side C " + sideC);
    }

    // Calculate & Return Perimeter of triangle
    public double perimeter() {
        // temporary variable for calculation
        double result = sideA + sideB + sideC;
        return result;
    }

    // Calculate & Return Area of Triangle
    public double area() {
        return 0;
    }

    public String toString() {
        return "Hello There";
    }

}
