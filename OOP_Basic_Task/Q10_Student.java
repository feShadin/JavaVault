import java.util.ArrayList;

public class Q10_Student {
    static class Student {
        String name;
        int grade;
        ArrayList<String> courses;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
            this.courses = new ArrayList<>();
        }

        void addCourse(String course) {
            courses.add(course);
        }

        void removeCourse(String course) {
            courses.remove(course);
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }

        void showCourses() {
            System.out.println(name + "'s courses: " + courses);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Carolus Vitali", 11);
        Student s2 = new Student("Nakeisha Uhuru", 10);
        Student s3 = new Student("Gabriella Cherice", 10);

        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();

        System.out.println("\nAdding courses for Carolus Vitali");
        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.addCourse("English");
        s1.showCourses();

        s2.addCourse("History");
        s2.addCourse("Geography");
        s2.addCourse("English");
        s2.showCourses();

        System.out.println("\nRemoving 'Science' course for Carolus Vitali");
        s1.removeCourse("Science");
        s1.showCourses();
    }
}