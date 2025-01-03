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
        Car car = new Car("2024","HighCross","RED",4, true);
        car.describeCar();
        System.out.println("Got make" + car.getMake());
        System.out.println("Got model" + car.getModel());

        Student student = new Student("Anoop","10/12/1996", "QWNAB80V","XII");
        System.out.println(student);
        System.out.println(student.getId());
        LPAStudent lpaStudent = new LPAStudent("Anoop","10/12/1996", "QWNAB80V","XII");
        System.out.println(lpaStudent);
        System.out.println(lpaStudent.id());
        printInformation("Hello World");
        printInformation("");


        ComputerCase theCase = new ComputerCase("2024","PowerAMPS", "220");
        Monitor theMonitor = new Monitor("2024","Sony", 27, "1080p");
        Motherboard theMotherBoard = new Motherboard("2023", "Asus", 4, 1, "V2.4");
        PersonalComputer theComputer = new PersonalComputer("2024", "Asus", theCase, theMonitor, theMotherBoard);
        theComputer.powerUp();

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();

    }

    public static void printInformation(String string) {
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        int length = string.length();
        System.out.printf("Length: %d %n",length);
        System.out.printf("First Character: %c %n", string.charAt(0));
    }
}
