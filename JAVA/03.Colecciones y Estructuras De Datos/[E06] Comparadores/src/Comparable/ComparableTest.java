package Comparable;

import ComparadoresTest.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        //Metodo 1 Con interface ComparableTest
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, "Leo", 28));
        students1.add(new Student(2, "Ingrid", 18));
        students1.add(new Student(3, "Pam", 19));
        students1.add(new Student(4, "Loa", 22));
        students1.add(new Student(3, "Octavio", 27));

        Collections.sort(students1, Collections.reverseOrder());

        students1.forEach(System.out::println);
        System.out.println("\n");
        
        //Metodo 2 Con interface ComparableTest
        ArrayList<Student2> student2 = new ArrayList<>();
        student2.add(new Student2(1, "Leo", 28));
        student2.add(new Student2(2, "Ingrid", 18));
        student2.add(new Student2(3, "Pam", 19));
        student2.add(new Student2(4, "Loa", 22));
        student2.add(new Student2(3, "Octavio", 27));

        Collections.sort(student2);
        student2.forEach(System.out::println);
    }
}
