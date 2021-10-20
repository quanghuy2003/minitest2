package sevice;

import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class TeacherManagement extends StudentManagement{
    private ArrayList<Teacher> listPeople;


    public TeacherManagement() {
        this.listPeople = new ArrayList<>();
    }

    public TeacherManagement(ArrayList<Teacher> listPeople) {
        this.listPeople = listPeople;
    }



}
