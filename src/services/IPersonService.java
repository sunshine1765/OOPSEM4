package services;

import java.util.List;

public interface IPersonService<T> {
    List<T> getAll();
    void create(String name, int age);
}
