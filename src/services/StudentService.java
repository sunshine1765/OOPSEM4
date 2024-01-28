package services;

import domain.PersonComporate;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
        sortByFio();
    }

    public void sortByFio() {
        PersonComporate<Student> studComp = new PersonComporate<>();
        students.sort(studComp);
    }

}
