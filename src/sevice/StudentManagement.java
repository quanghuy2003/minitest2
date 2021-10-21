package sevice;

import model.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement implements Manager<Student> {

    private ArrayList<Student> listStudent;


    public StudentManagement() {
        this.listStudent = new ArrayList<>();
    }

    public void PeopleManager(ArrayList<Student> listPeople) {
        this.listStudent = listPeople;
    }

    public void Manager() {
        listStudent = new ArrayList<>();
    }


    @Override
    public void print() {
        for (int i = 0; i < this.listStudent.size(); ++i) {
            System.out.println(this.listStudent.get(i));
        }
    }

    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.listStudent.size(); ++i) {
            if ((listStudent.get(i)).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void delete(int id) {
        int index = this.findIndexById(id);
        this.listStudent.remove(index);
    }

    @Override
    public void update(int id, Student student) {
        int index = findIndexById(id);
        listStudent.set(index, student);
    }

    @Override
    public void sort() {
        listStudent.sort(Comparator.comparingInt(Student::getId));
    }
}
