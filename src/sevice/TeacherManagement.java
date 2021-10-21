package sevice;

import model.Teacher;

import java.util.ArrayList;
import java.util.Comparator;

public class TeacherManagement implements Manager<Teacher>{
    private ArrayList<Teacher> listTeacher;


    public TeacherManagement() {
        this.listTeacher = new ArrayList<>();
    }

    public TeacherManagement(ArrayList<Teacher> listPeople) {
        this.listTeacher = listPeople;
    }


    @Override
    public void print() {
        for (int i = 0; i < this.listTeacher.size(); ++i) {
            System.out.println(this.listTeacher.get(i));
        }
    }

    @Override
    public void add(Teacher teacher) {
        listTeacher.add(teacher);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.listTeacher.size(); i++) {
            if ((listTeacher.get(i)).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void delete(int id) {
        int index = this.findIndexById(id);
        this.listTeacher.remove(index);
    }

    @Override
    public void update(int id, Teacher teacher) {
        int index = findIndexById(id);
        listTeacher.set(index, teacher);
    }

    @Override
    public void sort() {
        listTeacher.sort(Comparator.comparingInt(Teacher::getId));
    }

}
