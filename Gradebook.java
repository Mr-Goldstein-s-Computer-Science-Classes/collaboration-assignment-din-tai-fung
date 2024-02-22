import java.util.ArrayList;

public class Gradebook
{
    private ArrayList<Student> narnia;
    public Gradebook()
    {
        narnia = new ArrayList<Student>();
    }
    public void createStudent(Student student)
    {
        narnia.add(student);
    }
    public void addAssignment(String assignment)
    {
        for(Student kid:narnia)
        {
            kid.addAssignment(assignment);
        }
    }
    public void gradeAssignment(String assignment, String studentName, double grade)
    {
        for(Student kid:narnia)
        {
            if(kid.getName().equals(studentName))
            {
                kid.gradeAssignment(assignment,grade);
            }
        }
    }
    public double getAverageGrade(String assignment)
    {
        double average = 0;
        int headcount = 0;
        for(Student kid:narnia)
        {
            headcount++;
            average+= kid.getAssignmentGrade(assignment);
        }
        return (average/headcount);
    }
    public double getMaximumGrade(String assignment)
    {
        double maxgrade = 0;
        for(Student kid:narnia)
        {
            if(kid.getAssignmentGrade(assignment)>maxgrade)
            {
                maxgrade = kid.getGrade();
            }
        }
        return maxgrade;
    }
    public double getMinimumGrade(String assignment)
    {
        double mingrade = 100;
        for(Student kid:narnia)
        {
            if(kid.getAssignmentGrade(assignment)<mingrade)
            {
                mingrade = kid.getGrade();
            }
        }
        return mingrade;
    }
    public double getAverageOverall()
    {
        double average = 0;
        int headcount = 0;
        for(Student kid:narnia)
        {
            headcount++;
            average += kid.getOverallGrade();
        }
        return (average/headcount);
    }
    public double getMaxOverall()
    {
        double maxgrade = 0;
        for(Student kid:narnia)
        {
            if(kid.getOverallGrade()>maxgrade)
            {
                maxgrade = kid.getOverallGrade();
            }
        }
        return maxgrade;
    }
    public double getMinOverall()
    {
        double mingrade = 100;
        for(Student kid:narnia)
        {
            if(kid.getOverallGrade()<mingrade)
            {
                mingrade = kid.getOverallGrade();
            }
        }
        return mingrade;
    }
    public Student getStudent(String studentName)
    {

    }
    public double getStudentsGrade(String student)
    {
        return
    }
}