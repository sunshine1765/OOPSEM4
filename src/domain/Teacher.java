package domain;

public class Teacher extends Persone{
    private String academicDegree;

    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "academicDegree='" + academicDegree + '\'' +
                '}' + this.getName() + ", " +  this.getAge();
    }
}
