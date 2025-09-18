import java.time.LocalDate;
import java.time.Period;

public class Q9_Employee {
    static class Employee {
        String name;
        double salary;
        LocalDate hireDate;

        Employee(String name, double salary, String hireDate) {
            this.name = name;
            this.salary = salary;
            this.hireDate = LocalDate.parse(hireDate);
        }

        int yearsOfService() {
            return Period.between(hireDate, LocalDate.of(2023, 4, 1)).getYears();
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("HireDate: " + hireDate);
            System.out.println("Years of Service: " + yearsOfService());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Roberta Petrus", 50000, "2021-04-01");
        Employee e2 = new Employee("Loyd Blair", 70000, "2015-04-01");
        Employee e3 = new Employee("Magdalena Artemon", 50000, "2011-01-15");

        e1.display();
        e2.display();
        e3.display();
    }
}