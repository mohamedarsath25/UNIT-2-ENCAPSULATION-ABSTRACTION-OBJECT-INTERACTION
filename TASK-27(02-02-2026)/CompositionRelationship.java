class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

public class CompositionRelationship {

    private Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is Driving");
    }

    public static void main(String[] args) {
        CompositionRelationship car = new CompositionRelationship();
        car.drive();
    }
}