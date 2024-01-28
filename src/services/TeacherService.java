package services;

import domain.PersonComporate;
import domain.Student;
import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements IPersonService<Teacher> {
    private int count;
    List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "Доктор наук");
        count++;
        teachers.add(teach);
        sortByFio();
    }
    public void sortByFio() {
        PersonComporate<Teacher> teachCump = new PersonComporate<>();
        teachers.sort(teachCump);
    }
}
