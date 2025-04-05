package streams;

import java.util.List;

public class Project {
    private String projectId;
    private String projectName;
    private Integer uidNumber;
    private String department;
    private List<Student> students;

    Project(String projectId, String projectName, Integer uidNumber, String department, List<Student> students) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.uidNumber = uidNumber;
        this.department = department;
        this.students = students;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUidNumber() {
        return uidNumber;
    }

    public void setUidNumber(Integer uidNumber) {
        this.uidNumber = uidNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", uidNumber=" + uidNumber +
                ", department='" + department + '\'' +
                ", students=" + students +
                '}';
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
