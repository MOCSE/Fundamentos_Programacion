/*
    Use las interfaces Comparable y Comparator para ordenar los puntajes de los siguientes cuatro estudiantes en orden descendente. 
    Si los puntajes son los mismos, se ordenarán en orden descendente según los puntajes.

    Nota: Comparator no se implementa en la clase del objeto a comparar, 
    pero además de crear una clase para implementar compare en el Comparator
    luego agrega un comparador en el contenedor, y Comparable implementa el método compareTo en la clase del objeto a comparar.
 */
package Ejercicio5_Comparadores;

import java.util.*;

class MyCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getScore() > s2.getScore()) {
            return 1;
        } else if (s1.getScore() < s2.getScore()) {
            return -1;
        } else {
            if (s1.getAge() > s2.getAge()) {
                return 1;
            }
            if (s1.getAge() < s2.getAge()) {
                return -1;
            }
            return s1.getName().compareTo(s2.getName());
        }
    }
}

class Student {

    private String name;
    private int age;
    private float score;

    Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getScore() {
        return score;
    }

}

class Test {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyCompare());
        ts.add(new Student("liusan", 20, 90.0F));
        ts.add(new Student("lisi", 22, 90.0F));
        ts.add(new Student("wangwu", 20, 90.0F));
        ts.add(new Student("sunliu", 22, 100.0F));
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Student stu = (Student) it.next();
            System.out.println("score=" + stu.getScore() + " age=" + stu.getAge() + " name=" + stu.getName());
        }
    }
}
