abstract class AbstractClassImplementation {
    abstract void salary();
}

class Manager extends AbstractClassImplementation {

    void salary() {
        System.out.println("Manager Salary: 50000");
    }

    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.salary();
    }
}