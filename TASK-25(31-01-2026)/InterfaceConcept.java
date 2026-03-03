interface Payment {
    void pay(double amount);
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }

    public static void main(String[] args) {
        UPI obj = new UPI();
        obj.pay(1500);
    }
}