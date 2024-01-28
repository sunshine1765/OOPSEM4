package controllers;

import domain.Persone;
import domain.Teacher;

import java.util.List;

public class AccountController {
    public static <T extends Teacher, V> void paySalary(T person, V salar) {
        System.out.println(person.getName() + " выплачена зарплата " + salar);
    }

    public static <T extends Persone> void avgAge(List<T> peoples) {
        double sumAge = 0;
        for(T people : peoples) {
            sumAge += people.getAge();
        }
        System.out.println("Средний возраст : " + sumAge/peoples.size());
    }
}
