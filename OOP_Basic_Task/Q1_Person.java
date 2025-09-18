public class Q1_Person {
    // Person class
    static class Person {
        String name;
        int age;

        // Constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display info
        void display() {
            System.out.println(name + " is " + age + " years old.");
        }
    }

    public static void main(String[] args) {
        // Create two Person objects
        Person p1 = new Person("Ean Craig", 11);
        Person p2 = new Person("Evan Ross", 12);

        // Print initial details
        p1.display();
        p2.display();

        System.out.println();
        System.out.println("Set new age and name:");

        // Update values
        p1.age = 14;
        p2.name = "Lewis Jordan";

        // Print updated details
        System.out.println(p1.name + " is now " + p1.age + " years old.");
        System.out.println(p2.name + " is now " + p2.age + " years old.");
    }
}
