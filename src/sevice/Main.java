package sevice;

import model.Student;
import model.Teacher;

public class Main {
    public Main(){}

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.add(new Student(1,"abc",18,10));
        studentManagement.add(new Student(2,"bca",18,9));
        studentManagement.add(new Student(3,"cab",18,8));

        studentManagement.update(2,(new Student(3,"d",18,7)));
        studentManagement.delete(1);
        studentManagement.print();
        studentManagement.sort();
        studentManagement.print();

        TeacherManagement teacherManagement = new TeacherManagement();
        teacherManagement.add(new Teacher(4,"xyz",25));
        teacherManagement.print();
    }
}
