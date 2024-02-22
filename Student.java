import java.util.ArrayList;
public class Student {
private String name;
private String assignment;
private double grade;

    ArrayList<String> assignments;
    ArrayList<Double> grades;

    public String getName() {
        this.assignments =   new ArrayList<String>();;
        this.grades =  new ArrayList<Double>();
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


    public Student(String name)
    {
        this.name = name;

    }

    public void addAssignment(String assignName)
    {
        assignments.add(assignName);
        grades.add(null);

    }

    public void gradeAssignment(String assignment, double grade)
    {
       if(!(assignments.contains(assignment)))
       {
           System.out.println("Assignment not found");
       }
       else
       {
           grades.set(assignments.indexOf(assignment), grade);
       }
    }
    public double getAssignmentGrade(String assignment)
    {
        if(!(assignments.contains(assignment)))
        {
            System.out.println("Assignment not found");
            return -1;
        }
        else
        {
            return grades.get(assignments.indexOf(assignment));
        }
    }

    public double getOverallGrade()
    {
        double total = 0;
        int average = 0;
        if(grades.isEmpty()&&assignments.isEmpty()) {
            System.out.println("No grades");
            return -1;
        }
        for(double grade: grades)
        {
            if(!(grades.equals(null)))
            {
               total += total + grade;
               average++;
            }

        }
        return total/average;
    }

    public String toString()
    {
        return "Student name: " + name + "/nStudents average: " + getOverallGrade();
    }

}
