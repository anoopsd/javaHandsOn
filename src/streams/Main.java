package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;
}
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        List<Project> projects  = new ArrayList<>();
        projects.add(new Project("id_001", "PROJ__01", 2020, "dev", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));
        projects.add(new Project("id_002", "PROJ__02", 2021, "dev", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));
        projects.add(new Project("id_003", "PROJ__03", 2022, "qa", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));
        projects.add(new Project("id_004", "PROJ__04", 2023, "qa", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));
        projects.add(new Project("id_005", "PROJ__05", 2024, "finance", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));
        projects.add(new Project("id_006", "PROJ__06", 2025, "cleaning", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));
        projects.add(new Project("id_007", "PROJ__07", 2026, "dev", List.of(new Student("STD_001", "STD__NAME__01", 20, "SIXTH"), new Student("STD_002", "STD__NAME__02", 22, "EIGHT"))));


        Map<String, String> filtered = projects.stream().filter(project -> project.getUidNumber() == 2020).collect(Collectors.toMap(Project::getProjectId, Project::getProjectName));
        System.out.println(filtered);

        // Map
        List<String> departmentList = projects.stream().map(
                Project::getDepartment
        ).distinct().toList();

        System.out.println(departmentList);


        List<String> studentNameList = projects.stream()
                        .flatMap(e -> e.getStudents().stream())
                                .map(Student::getStudentName).toList();

        System.out.println(studentNameList);

        Optional<Project> listSorted = projects.stream()
                        .min(Comparator.comparing(Project::getUidNumber));
        System.out.println(listSorted);


        Map<String, Long> collect = projects.stream()
                .collect(Collectors.groupingBy(Project::getDepartment, Collectors.counting()));
        System.out.println(collect);

        // find first

        Project first = projects.stream().filter(project -> project.getDepartment().equals("dev"))
                .findAny().orElseThrow(() -> new IllegalArgumentException("Illegal Argument"));

        System.out.println(first);

        boolean developAnyMatch = projects.stream().allMatch(proj -> proj.getDepartment().equals("dev"));

        System.out.println(developAnyMatch);


        // Find the longest string in the list of string.
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> longestString = strings.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println(longestString);

        // Calculate average age of a list of person object.
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        double average = persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println(average);


        //Check if a list of integers contains a prime number using Java streams
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containdPrime = numbers.stream().anyMatch(Main::isPrime);
        System.out.println(containdPrime);

        // Merge two sorted lists into a single sorted list using Java streams
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> concat = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println(concat);

        //Intersection
        List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list22 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> intersection = list11.stream().filter(list22::contains).toList();
        System.out.println(intersection);

        //Remove duplicates from a list
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> unique =  numbersWithDuplicates.stream().distinct().toList();
        System.out.println(unique);

        Class<?> class1 = Class.forName("streams.Person");
        System.out.println(Arrays.toString(class1.getDeclaredFields()));


        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        Integer[] array1 = {1,2,3};
        Arrays.sort(array1, (a,b) -> b - a);

        System.out.println(Arrays.toString(array1));

        Season season = Season.valueOf("SPRING");
        System.out.println(season.name());
        System.out.println(Season.WINTER.ordinal());

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i =2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Person {
    private String firstName;
    private int age;
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
