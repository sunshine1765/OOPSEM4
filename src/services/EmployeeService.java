package services;

import domain.Employee;
import domain.PersonComporate;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IPersonService<Employee>{
    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age, "Разнорабочий");
        count++;
        employees.add(emp);
    }

    public void sorByFio() {
        PersonComporate<Employee> emCom = new PersonComporate<>();
        employees.sort(emCom);
    }

}
