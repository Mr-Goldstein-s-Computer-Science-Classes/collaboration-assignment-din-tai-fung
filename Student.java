import java.util.ArrayList;
public class Student {
private String name;
private String assignment;
private double grade;
private String assignName;
    ArrayList<String> assignments =  new ArrayList<String>();;

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
        assignments.add(assignName);

    }

    public void gradeAssignment(String assignment, double grade)
    {
            this.grade = grade;
             assignment = "graded";
    }
    public double getAssignmentGrade(String assignment)
    {
        this.assignment = assignment;
return 22;
    }

    public double getOverallGrade()
    {
        for(assigments)
    }

    public String toString()
    {
        return "k";
    }

}
