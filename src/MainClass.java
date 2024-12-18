public class MainClass {
    public static void main(String[] args) {
        double firstNum = 20.00d;
        double secondNum = 83.00d;
        double result = (firstNum + secondNum) * 100.00d;
        double reminder = result % 40.00d;
        boolean isZero = reminder == 0 ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
