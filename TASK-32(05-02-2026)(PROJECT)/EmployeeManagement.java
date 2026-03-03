import java.util.*;

interface Payable {
    double calculateSalary();
}

class Address {
    private String city;

    Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

abstract class Employee implements Payable {
    private int id;
    private String name;
    private Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("City: " + address.getCity());
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("-------------------");
    }
}

class FullTime extends Employee {
    private double salary;

    FullTime(int id, String name, Address address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class PartTime extends Employee {
    private int hours;
    private double rate;

    PartTime(int id, String name, Address address, int hours, double rate) {
        super(id, name, address);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add FullTime  2.Add PartTime  3.Display  4.Exit");
            choice = sc.nextInt();   // ✅ fixed semicolon

            if (choice == 1 && count < n) {

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("City: ");
                String city = sc.nextLine();

                System.out.print("Salary: ");
                double sal = sc.nextDouble();

                employees[count++] = new FullTime(id, name, new Address(city), sal);
            }

            else if (choice == 2 && count < n) {

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("City: ");
                String city = sc.nextLine();

                System.out.print("Hours: ");
                int hours = sc.nextInt();

                System.out.print("Rate: ");
                double rate = sc.nextDouble();

                employees[count++] = new PartTime(id, name, new Address(city), hours, rate);
            }

            else if (choice == 3) {

                for (int i = 0; i < count; i++) {
                    employees[i].display();
                }
            }

        } while (choice != 4);

        sc.close();
    }
}