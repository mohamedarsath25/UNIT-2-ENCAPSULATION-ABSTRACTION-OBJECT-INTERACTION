public class AccessModifier {

    public int publicVar = 10;
    private int privateVar = 20;

    public int getPrivateVar() {
        return privateVar;
    }

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println("Public Variable: " + obj.publicVar);
        System.out.println("Private Variable (via Getter): " + obj.getPrivateVar());
    }
}