package sevice;

import model.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement implements Manager<Student>{

    private ArrayList<Student> listPeople;


    public StudentManagement() {
        this.listPeople = new ArrayList<>();
    }

    public void PeopleManager(ArrayList<Student> listPeople) {
        this.listPeople = listPeople;
    }

    public void Manager() {
       listPeople= new ArrayList<> ();
    }


    @Override
    public void print() {
        for (int i = 0; i < this.listPeople.size(); ++i) {
            System.out.println(this.listPeople.get(i));
        }
    }

    @Override
    public void add(Student student) {
        listPeople.add(student);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.listPeople.size(); ++i) {
            if ((listPeople.get(i)).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void delete(int id) {
        int index = this.findIndexById(id);
        this.listPeople.remove(index);
    }

    @Override
    public void update(int id, Student student) {
        int index = findIndexById(id);
        listPeople.set(index, student);
    }

    @Override
    public void sort() {
        listPeople.sort(Comparator.comparingInt(Student::getId));
    }
}
