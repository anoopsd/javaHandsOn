package streams;

public class Student {
    private String studentId;
    private String studentName;
    private String className;
    private Integer age;

    public Student(String studentId, String studentName, Integer age, String className) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.className = className;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                '}';
    }
}
