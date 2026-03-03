public class EncapsulationValidation {

    private int age;
    private double balance;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age must be 18 or above.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        EncapsulationValidation obj = new EncapsulationValidation();
        obj.setAge(20);
        obj.deposit(5000);
        obj.display();
    }
}