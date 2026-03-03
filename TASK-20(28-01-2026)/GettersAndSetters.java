public class GettersAndSetters {

    private String college;

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public static void main(String[] args) {
        GettersAndSetters obj = new GettersAndSetters();
        obj.setCollege("ABC College");
        System.out.println("College Name: " + obj.getCollege());
    }
}