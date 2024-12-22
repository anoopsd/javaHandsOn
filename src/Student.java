// POJO
public class Student {
    private String name;
    private String datOfBirth;
    private String id;
    private String classList;

    public Student(String name, String datOfBirth, String id, String classList) {
        this.name = name;
        this.datOfBirth = datOfBirth;
        this.id = id;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", datOfBirth='" + datOfBirth + '\'' +
                ", id='" + id + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
