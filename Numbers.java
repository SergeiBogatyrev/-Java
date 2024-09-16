public class Numbers {
    private int a;
    private int b;

    public void setNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getComparison() {
        if (this.a == this.b) {
            System.out.println("a = b");
        } else if (this.a < this.b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }

    public void getMathematicalOperations() {
        long summ, subtraction, multiplication;
        double division;
        summ = (long) this.a + this.b;
        System.out.println("Сумма чисел " + summ);
        subtraction = (long) this.a - this.b;
        System.out.println("Разница чисел " + subtraction);
        multiplication = (long) this.a * this.b;
        System.out.println("Результат умножения " + multiplication);
        division = (double) this.a / this.b;
        System.out.println("Результат деления " + division);

    }

}
