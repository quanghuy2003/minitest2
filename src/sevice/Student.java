package sevice;

import model.People;

public class Student  extends People {

    private int point;

    public Student(int id, String name, int age, int point) {
        super(id, name, age);
        this.point = point;
    }

    public Student(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                " id " + super.getId() +
                ", name '" + super.getName() + '\'' +
                ", age " + super.getAge() +
                "point " + point +
                '}';
    }
}
