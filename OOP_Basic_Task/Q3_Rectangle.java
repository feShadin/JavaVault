public class Q3_Rectangle {
    static class Rectangle {
        double width, height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double area() {
            return width * height;
        }

        double perimeter() {
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 7);
        System.out.println("The area of the rectangle is " + r.area());
        System.out.println("The perimeter of the rectangle is " + r.perimeter());

        System.out.println();
        r.width = 9;
        r.height = 8;
        System.out.println("The area of the rectangle is now " + r.area());
        System.out.println("The perimeter of the rectangle is now " + r.perimeter());
    }
}