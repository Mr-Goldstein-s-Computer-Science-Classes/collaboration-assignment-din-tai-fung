import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gradebook> grades = new ArrayList<Gradebook>();
        Student tyler =  new Student("Tyler");
        Student james =  new Student("James");
        Student ethan =  new Student("Ethan");
        Student scotty =  new Student("Scotty");
        Student david =  new Student("David");
        Student patrick =  new Student("Patrick");

        grades.add(tyler);
        grades.add(james);
        grades.add(ethan);
        grades.add(scotty);
        grades.add(david);
        grades.add(patrick);
    }
}
