package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first");
        } else if (x < 0 && y > 0) {
            System.out.println("second");
        } else if (x < 0 && y < 0) {
            System.out.println("third");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth");
        } else if (x == 0 && y == 0) {
            System.out.println("zero");
        } else {
            System.out.println("The point lies on one of the axes (X-axis or Y-axis).");
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CoordinatePane <x-coordinate> <y-coordinate>");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        CoordinatePane cp = new CoordinatePane();
        cp.printQuadrant(x, y);
    }
}

