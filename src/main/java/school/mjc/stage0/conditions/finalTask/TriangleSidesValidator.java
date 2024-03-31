package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        TriangleSidesValidator validator = new TriangleSidesValidator();
        double firstSide = 3.0;
        double secondSide = 4.0;
        double thirdSide = 5.0;
        validator.validate(firstSide, secondSide, thirdSide);
    }
}

