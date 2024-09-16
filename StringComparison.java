public class StringComparison {
    private String a, b;

    public void setStr(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void getComparison() {
        if (this.a.equals(this.b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
