import java.util.Arrays;
import java.util.Random;

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


        // Arrays

        int[] firstArray = new int[10];
        firstArray[0] = 5;

        double[] firstArray2 = new double[10];
        firstArray2[0] = 5.5;

        String[] food = {"idli", "dosa", "sambar"};
        String formattedArray = Arrays.toString(food);
        System.out.println(formattedArray);
        for (String foodItem : food ) {
            System.out.println(foodItem);
        }
        Integer[] randArray = getRandomArray(10);
        Arrays.sort(randArray);
        System.out.println(Arrays.toString(randArray));

        int[] orderedArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(orderedArr));
        reverseArray(orderedArr);
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

    private static Integer[] getRandomArray(int length) {
        Random rand = new Random();
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(100);
        }

        return array;
    }

    private static void reverseArray(int[] array) {
        int length = array.length;
        int first = 0;
        int last = length - 1;
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(array));
    }
}
