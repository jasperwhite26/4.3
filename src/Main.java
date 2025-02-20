import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 4.0);
        Student jasper = new Student("Jasper", 3.7);
        Student jay = new Student("Jay", 1.7);

        List<Student> school = new ArrayList<>();
        school.add(alice);
        school.add(jasper);
        school.add(jay);

        Collections.sort(school);
        System.out.print(school);
    }




}
