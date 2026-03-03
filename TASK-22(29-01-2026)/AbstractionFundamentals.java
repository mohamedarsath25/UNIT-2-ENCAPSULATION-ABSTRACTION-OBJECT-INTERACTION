abstract class AbstractionFundamentals {

    abstract void withdraw();

    void checkBalance() {
        System.out.println("Balance Checked");
    }

    public static void main(String[] args) {
        AbstractionFundamentals obj = new AbstractionFundamentals() {
            void withdraw() {
                System.out.println("Money Withdrawn");
            }
        };

        obj.withdraw();
        obj.checkBalance();
    }
}