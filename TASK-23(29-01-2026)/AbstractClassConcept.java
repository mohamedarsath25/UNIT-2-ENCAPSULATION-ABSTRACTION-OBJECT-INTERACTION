abstract class AbstractClassConcept {
    abstract void display();
}

class Student extends AbstractClassConcept {
    void display() {
        System.out.println("Abstract Method Implemented");
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }
}