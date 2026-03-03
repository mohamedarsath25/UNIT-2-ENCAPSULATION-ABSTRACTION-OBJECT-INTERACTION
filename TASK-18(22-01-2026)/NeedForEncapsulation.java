public class NeedForEncapsulation {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        NeedForEncapsulation obj = new NeedForEncapsulation();
        obj.setName("Arsath");
        obj.setAge(20);
        obj.display();
    }
}