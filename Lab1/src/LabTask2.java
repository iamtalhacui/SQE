// Name : Muhammad Talha
// Reg-No : FA23-BSE-076


class Point {
    double xCord;
    double yCord;


    Point(double xCord, double yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }


    void setXCord(double xCord) {
        this.xCord = xCord;
    }


    void setYCord(double yCord) {
        this.yCord = yCord;
    }


    double getXCord() {
        return xCord;
    }


    double getYCord() {
        return yCord;
    }


    void display() {
        System.out.println("Point = (" + xCord + ", " + yCord + ")");
    }
}


class Line {
    Point startPoint;
    Point endPoint;


    Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint   = endPoint;
    }


    double findLength() {
        double x1 = startPoint.getXCord();
        double y1 = startPoint.getYCord();
        double x2 = endPoint.getXCord();
        double y2 = endPoint.getYCord();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}


public class LabTask2 {
    public static void main(String[] args) {


        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Line line1 = new Line(p1, p2);
        System.out.println("--- Non-Failure Test 1 ---");
        p1.display();
        p2.display();
        System.out.println("Expected Length: 5.0");
        System.out.println("Actual Length  : " + line1.findLength());


        Point p3 = new Point(1, 1);
        Point p4 = new Point(4, 5);
        Line line2 = new Line(p3, p4);
        System.out.println("\n--- Non-Failure Test 2 ---");
        p3.display();
        p4.display();
        System.out.println("Expected Length: 5.0");
        System.out.println("Actual Length  : " + line2.findLength());


        Point p5 = new Point(3, 3);
        Point p6 = new Point(3, 3);
        Line line3 = new Line(p5, p6);
        System.out.println("\n--- Non-Failure Test 3 ---");
        p5.display();
        p6.display();
        System.out.println("Expected Length: 0.0");
        System.out.println("Actual Length  : " + line3.findLength());



        // Failure Test 1: Wrong operator (+ instead of -)
        // Error  : Developer typed (x2 + x1) instead of (x2 - x1)
        // Fault  : return Math.sqrt(Math.pow(x2+x1,2) + Math.pow(y2+y1,2));
        // Failure: Points (0,0)→(3,4) gives 7.81 instead of 5.0
        // To test: change findLength() formula to use + instead of -



        // Failure Test 2: Forgot Math.sqrt()
        // Error  : Developer forgot to wrap formula in Math.sqrt()
        // Fault  : return Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
        // Failure: Points (0,0)→(3,4) gives 25.0 instead of 5.0
        // To test: remove Math.sqrt() from findLength()



        // Failure Test 3: getXCord() returns yCord by mistake
        // Error  : Developer wrote  return yCord;  inside getXCord()
        // Fault  : getXCord() gives wrong value
        // Failure: Points (0,0)→(3,4) gives wrong length
        // To test: change getXCord() to return yCord instead of xCord

    }
}
