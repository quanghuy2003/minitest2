package sevice;

import model.Teacher;

public class Main {
    public Main(){}

    public static void main(String[] args) {
        StudentManagement ql = new StudentManagement();
        ql.add(new Student(1,"abc",18,10));
        ql.add(new Student(2,"bca",18,9));
        ql.add(new Student(3,"cab",18,8));

        ql.update(2,(new Student(3,"d",18,7)));
        ql.delete(1);
        ql.print();
        ql.sort();
        ql.print();

        TeacherManagement qlT = new TeacherManagement();
        qlT.add(new Teacher(4,"xyz",25));
        qlT.print();
    }
}
