import java.util.*;

public class MainClass {
    record Place(String name, int distance){
        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }
    private static Scanner scanner = new Scanner(System.in);
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

        // Multi dimensional array
        int [][] arr = new int[4][4];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        for(int[] outer : arr) {
            System.out.println(Arrays.toString(outer));
        }
        // List & ArrayList

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Chicken", "MEAT", 5));
        groceryList.add(new GroceryItem("Beans", "VEGETABLE", 10));
        System.out.println(groceryList) ;

        boolean flag = false;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

        // Linked List
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.push("Delhi");
        placesToVisit.add("Coorg");
        placesToVisit.addFirst("Shanghai");
        System.out.println(placesToVisit);

        // Linked list challenge
        LinkedList<Place> places = new LinkedList<>();
        addPlace(places, new Place("adelaide", 1374));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));

        places.addFirst(new Place("Sydney", 0));
        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean challengeFlag = true;
        boolean forward =  true;
        printChallengeActions();
        while (challengeFlag) {
            if (!iterator.hasPrevious()) {
                System.out.println("Orginating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Ending: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
            switch (menuItem) {
                case "F" -> {
                    System.out.println("User want to go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("User want to go backward");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> {
                    printChallengeActions();
                }
                case "L" -> {
                    System.out.println(places);
                }
                default -> challengeFlag = false;
            }
        }

    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        if (places.contains(place)) {
            return;
        }
        for (Place p : places) {
            if(p.name().equalsIgnoreCase(place.name())) {
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace : places) {
            if (place.distance() < listPlace.distance()) {
                places.add(matchedIndex, place);
                return;
            }
        }
        places.add(place);
    }

    private static void printChallengeActions() {
        String inputBlock = """
                Available actions (Select word or letter):
                (F)orward
                (B)ackward
                (L)ist places in the list.
                (M)enu
                (Q)uit""";
        System.out.println(inputBlock + " ");
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove items(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            String trimmedItem = item.trim();
            if (groceries.contains(trimmedItem)) {
                groceries.remove(trimmedItem);
            }
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add items(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmedItem = item.trim();
            if (!groceries.contains(trimmedItem)) {
                groceries.add(trimmedItem);
            }
        }
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

    private static void printActions() {
        String inputBlock = """
                Available actions:
                
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any item(s) (comma delimited list)
                
                Enter a number for which you want to do:""";
        System.out.println(inputBlock + " ");
    }
}
