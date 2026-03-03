class Address {
    String city = "Chennai";
}

public class CompositionLab {

    Address address = new Address();

    void show() {
        System.out.println("City: " + address.city);
    }

    public static void main(String[] args) {
        CompositionLab obj = new CompositionLab();
        obj.show();
    }
}