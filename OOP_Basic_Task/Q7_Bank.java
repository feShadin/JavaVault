import java.util.ArrayList;

public class Q7_Bank {
    static class Account {
        String name, accNo;
        double balance;

        Account(String name, String accNo, double balance) {
            this.name = name;
            this.accNo = accNo;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            balance -= amount;
        }

        void display() {
            System.out.println("Name: " + name + ", Account Number: " + accNo + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account("Peter Irmgard", "C0011", 5000);
        Account a2 = new Account("Katja Ruedi", "C0121", 4500);
        Account a3 = new Account("Marcella Gebhard", "C0222", 20000);

        a1.display();
        a2.display();
        a3.display();

        System.out.println("\nAfter depositing 1000 into account1:");
        a1.deposit(1000);
        a1.display();

        System.out.println("No transaction in account2:");
        a2.display();

        System.out.println("After withdrawing 5000 from account3:");
        a3.withdraw(5000);
        a3.display();
    }
}