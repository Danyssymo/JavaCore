package OlgaJava.HomeWork12.Seven;

public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getSquare() {
        double square1 = p1.distance(p2);
        double square2 = p2.distance(p3);
        double square3 = p3.distance(p1);

        double per = (square1 + square2 + square3) / 2;

        return Math.sqrt(per * (per - square1) * (per - square2) * (per - square3));
    }

    public double getPerimeter() {
        double per1 = p1.distance(p2);
        double per2 = p2.distance(p3);
        double per3 = p3.distance(p1);

        return per1 + per2 + per3;
    }

    public Point getMedian() {
        double x = (p1.getX() + p2.getX() + p3.getX()) / 3;
        double y = (p1.getY() + p2.getY() + p3.getY()) / 3;

        return new Point(x, y);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
}
