import controllers.AccountController;
import domain.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student5 = new Student("Евгений", 19);
        Student student1 = new Student("Василий", 20);
        Student student4 = new Student("Ольга", 19);
        Student student2 = new Student("Анна", 25);
        Student student3 = new Student("Александра", 19);




//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        StudentGroup group = new StudentGroup(list, 1);

        for(Student student : group) {
            System.out.println(student);
        }

        Collections.sort(group.getList());

        System.out.println("-----------");

        for(Student student : group) {
            System.out.println(student);
        }

        List<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher("Эдуард", 50, "Доцент");
        Employee e1 = new Employee("Федор", 35, "Дворник");
        Teacher t2 = new Teacher("Гриша", 19, "Старший преподаватель");
        teachers.add(t1);
        teachers.add(t2);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        List<Persone> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(student4);
        people.add(student5);
        people.add(t1);
        people.add(t2);
        people.add(e1);

//        AccountController controller = new AccountController();
//        controller.paySalary(t1, 50000);
//        controller.paySalary(e1, 25000);
//        controller.paySalary(student1, 20000);
        AccountController.paySalary(t1, 50000);
        AccountController.avgAge(people);
    }
}
