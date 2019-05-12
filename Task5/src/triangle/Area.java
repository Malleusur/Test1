package triangle;

public class Area {
    double x1 = 1.0;
    double x2 = 1.0;
    double x3 = 3.0;
    double y1 = 1.0;
    double y2 = 2.0;
    double y3 = 3.0;
    double triangleArea;

    public double areaCalculate() {
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        if (a + b <= c || a + c <= b || a + c <= b) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("Wrong coordinates");
            }
        } else {
            double per = (a + b + c) / 2;
            triangleArea = Math.sqrt(per * (per - a) * (per - b) * (per - c));

        }
        return triangleArea;
    }
}

