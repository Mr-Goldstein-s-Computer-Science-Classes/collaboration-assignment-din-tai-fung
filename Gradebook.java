import java.util.ArrayList;

public class Gradebook
{
    private ArrayList<Student> narnia = new ArrayList<Student>();
    public Gradebook()
    {
    }
    public void createStudent(String name)
    {
        Student student = new Student(name);
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
                kid.setGrade();
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
}