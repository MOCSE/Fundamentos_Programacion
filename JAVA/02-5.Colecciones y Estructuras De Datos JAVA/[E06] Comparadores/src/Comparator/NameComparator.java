
package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student std1, Student std2) {
        return std1.getName().compareTo(std2.getName());
    }
    
    
    
}
