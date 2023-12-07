package OlgaJava.HomeWork12.Seven;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 6);
        Point p3 = new Point(0, 4);

        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println("Площадь треугольника: " + triangle.getSquare());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        Point median = triangle.getMedian();
        System.out.println("Точка пересечения медиан: (" + median.getX() + ", " + median.getY() + ")");
    }
}
