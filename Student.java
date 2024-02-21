import java.util.ArrayList;
public class Student {
private String name;
private String assignment;
private double grade;
private String assignName;
    ArrayList<String> students = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getAssignName() {
        return assignName;
    }

    public void setAssignName(String assignName) {
        this.assignName = assignName;
    }

    public Student(String name)
    {
        this.name = name;
    }

    public void addAssignment(String assignName)
    {
        assignName = "ungraded";
        students.add(assignName);

    }

    public void gradeAssignment(String assignment, double grade)
    {

    }

    public double getAssignmentGrade(String assignment)
    {

    }

}
