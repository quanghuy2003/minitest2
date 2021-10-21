package model;

public class Teacher extends People {

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher() {
    }


    @Override
    public String toString() {
        return "teacher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
