import java.util.Scanner;

interface Payable {
    double calculateSalary();
}

class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return city + ", " + state;
    }
}

class Employee implements Payable {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public double calculateSalary() {
        return 0;
    }

    public void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, Address address, double monthlySalary) {
        super(id, name, address);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hours;
    private double rate;

    public PartTimeEmployee(int id, String name, Address address, double hours, double rate) {
        super(id, name, address);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\n--- Employee " + (i + 1) + " ---");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("City: ");
            String city = sc.nextLine();

            System.out.print("State: ");
            String state = sc.nextLine();

            Address address = new Address(city, state);

            System.out.print("Type (1=FullTime, 2=PartTime): ");
            int type = sc.nextInt();

            if (type == 1) {
                System.out.print("Monthly Salary: ");
                double sal = sc.nextDouble();
                emp[i] = new FullTimeEmployee(id, name, address, sal);
            } else {
                System.out.print("Hours: ");
                double h = sc.nextDouble();
                System.out.print("Rate: ");
                double r = sc.nextDouble();
                emp[i] = new PartTimeEmployee(id, name, address, h, r);
            }
        }

        System.out.println("\n====== PAYROLL ======");

        for (Employee e : emp) {
            e.display();
        }

        sc.close();
    }
}