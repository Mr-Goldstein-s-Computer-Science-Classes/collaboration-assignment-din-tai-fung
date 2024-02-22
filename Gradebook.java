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
        
    }
    public double getAverageGrade(String assignment)
    {

    }
}