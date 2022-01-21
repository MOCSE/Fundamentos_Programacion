package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProbandoComparadores {
    public static void main(String[] args) {
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student(1, "Leo", 28));
        students2.add(new Student(2, "Ingrid", 18));
        students2.add(new Student(3, "Pam", 19));
        students2.add(new Student(4, "Loa", 22));
        students2.add(new Student(3, "Octavio", 27));

        Collections.sort(students2, new AgeComparator());
        
         Collections.sort(
                students2, 
                (std1, std2) -> {
                        if (std1.getAge() == std2.getAge()) {
                            return 0;
                        }
                        else if(std1.getAge() > std2.getAge()){
                            return -1;
                        }
                        else {
                            return 1;
                        }
                    }
                );
        
        System.out.println("Comparamiento utilizando Comparator: ");
        students2.forEach(System.out::println);
        System.out.println("\n");
        
        
        
        
        
        
        ArrayList<Student> studentsByName = new ArrayList<>();
        studentsByName.add(new Student(1, "Leo", 28));
        studentsByName.add(new Student(2, "Ingrid", 18));
        studentsByName.add(new Student(3, "Pam", 19));
        studentsByName.add(new Student(4, "Loa", 22));
        studentsByName.add(new Student(3, "Octavio", 27));

        Collections.sort(studentsByName, new NameComparator());
        System.out.println("Comparamiento por nombres utilizando Comparator: ");
        studentsByName.forEach(System.out::println);
        System.out.println("\n");

        
        
        
        
        
        ArrayList<Student> studentsByName2 = new ArrayList<>();
        studentsByName2.add(new Student(1, "Leo", 28));
        studentsByName2.add(new Student(2, "Ingrid", 18));
        studentsByName2.add(new Student(3, "Pam", 19));
        studentsByName2.add(new Student(4, "Loa", 22));
        studentsByName2.add(new Student(3, "Octavio", 27));

        Collections.sort(studentsByName2, (std1, std2) -> std1.getName().compareTo(std2.getName()) );
        System.out.println("Comparamiento por nombres utilizando Comparator: ");
        studentsByName2.forEach(System.out::println);
        System.out.println("\n");
    }
}
