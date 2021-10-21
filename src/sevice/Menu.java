package sevice;

import model.Student;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManager = new StudentManagement();
        int selection;
        do {
            System.out.println("---------------------Menu-------------------");
            System.out.println(" 1 : Thêm hs ");
            System.out.println(" 2 : Xóa hs ");
            System.out.println(" 3 : Sửa hs ");
            System.out.println(" 4 : Tìm kiếm hs ");
            System.out.println(" 5 : Sắp xếp hs theo điểm ");
            System.out.println(" 6  : Hiển thị danh sách hs ");
            System.out.println(" 0 : kết thúc ");
            selection = scanner.nextInt();
            if (selection > 0 && selection < 7) {
                switch (selection) {
                    case 1:
                        System.out.println("Nhập tên hs : ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Nhập id cho hs : ");
                        int id = scanner.nextInt();
                        System.out.println("Nhập độ tuổi của hs :");
                        int age = scanner.nextInt();
                        System.out.println("Nhập số điểm trung bình của hs :");
                        int mediumScore = scanner.nextInt();
                        studentManager.add(new Student(id, name, age, mediumScore));
                        break;
                    case 2:
                        System.out.println("Nhập vào id hs mà bạn muốn xóa : ");
                        int deleteId = scanner.nextInt();
                        studentManager.delete(deleteId);
                        break;
                    case 3:
                        System.out.println("Nhập id hs mà bạn muốn sửa");
                        int idWantToFix = scanner.nextInt();
                        if (studentManager.findIndexById(idWantToFix) > -1) {
                            System.out.println("Nhập tên hs : ");
                            scanner.nextLine();
                            String setName = scanner.nextLine();
                            System.out.println("Nhập id cho hs : ");
                            int setId = scanner.nextInt();
                            System.out.println("Nhập độ tuổi của hs :");
                            int setAge = scanner.nextInt();
                            System.out.println("Nhập số điểm trung bình của hs :");
                            int setMediumScore = scanner.nextInt();
                            Student newStudent = new Student(setId, setName, setAge, setMediumScore);
                            studentManager.update(idWantToFix, newStudent);
                        }
                        break;


                    case 4:
                        System.out.println("Nhập id của sinh viên mà bạn muốn tìm");
                        int idWantToFind = scanner.nextInt();
                        studentManager.findIndexById(idWantToFind);
                        break;
                    case 5:
                        studentManager.sort();
                        break;
                    case 6:
                        studentManager.print();
                        break;
                }

            } else if (selection < 0 || selection > 6) {
                System.out.println("Chúng tôi chưa phát triển chức năng này ! ");
            } else {
                System.out.println("đã tắt chương trình");
            }
        } while (selection != 0);
    }
}


