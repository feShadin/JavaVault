public class Q4_Circle {
    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }

        double circumference() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Radius of the circle is " + c.radius);
        System.out.println("The area of the circle is " + c.area());
        System.out.println("The circumference of the circle is: " + c.circumference());

        System.out.println();
        c.radius = 8;
        System.out.println("Radius of the circle is " + c.radius);
        System.out.println("The area of the circle is now " + c.area());
        System.out.println("The circumference of the circle is now " + c.circumference());
    }
}