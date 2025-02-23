import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private double gpa;


    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return name + " GPA: " + gpa;
    }

    @Override
    public int compareTo(Student other){
        return Double.compare(this.gpa, other.gpa);
    }

}
