public class Q8_TrafficLight {
    static class TrafficLight {
        String color;
        int duration;

        TrafficLight(String color, int duration) {
            this.color = color;
            this.duration = duration;
        }

        boolean isRed() {
            return color.equals("red");
        }

        boolean isGreen() {
            return color.equals("green");
        }

        void changeColor(String newColor) {
            this.color = newColor;
        }
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("red", 30);

        System.out.println("The light is red: " + t.isRed());
        System.out.println("The light is green: " + t.isGreen());

        t.changeColor("green");
        System.out.println("The light is now green: " + t.isGreen());

        System.out.println("The light duration is: " + t.duration);
        t.duration = 20;
        System.out.println("The light duration is now: " + t.duration);
    }
}