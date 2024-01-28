package domain;

public class Student extends Persone implements Comparable<Student>{
    private int id;
    static int generalId;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}' + super.toString();
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getName() + "-" + o.getName());

        if(o.getAge() > super.getAge()) {
            return -1;
        }
        if(o.getAge() < super.getAge()) {
            return 1;
        }

        if(o.getId() > id) {
            return -1;
        }
        if(o.getId() < id) {
            return 1;
        }
        return 0;
    }
}
