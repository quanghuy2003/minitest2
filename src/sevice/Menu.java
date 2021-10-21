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
            System.out.println(" 1 : Thêm học sinh ");
            System.out.println(" 2 : Xóa học sinh ");
            System.out.println(" 3 : Sửa học sinh ");
            System.out.println(" 4 : Tìm kiếm học sinh ");
            System.out.println(" 5 : Sắp xếp học sinh theo điểm ");
            System.out.println(" 6  : Hiển thị danh sách học sinh ");
            System.out.println(" 0 : kết thúc ");
            selection = scanner.nextInt();
            if (selection > 0 && selection < 7) {
                switch (selection) {
                    case 1:
                        System.out.println("Nhập tên học sinh : ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Nhập id cho học sinh : ");
                        int id = scanner.nextInt();
                        System.out.println("Nhập độ tuổi của học sinh :");
                        int age = scanner.nextInt();
                        System.out.println("Nhập số điểm trung bình của học sinh :");
                        int mediumScore = scanner.nextInt();
                        studentManager.add(new Student(id, name, age, mediumScore));
                        break;
                    case 2:
                        System.out.println("Nhập vào id học sinh mà bạn muốn xóa : ");
                        int idWantToDelete = scanner.nextInt();
                        studentManager.delete(idWantToDelete);
                        break;
                    case 3:
                        System.out.println("Nhập id học sinh mà bạn muốn sửa");
                        int idWantToFix = scanner.nextInt();
                        if (studentManager.findIndexById(idWantToFix) != -1) {
                            System.out.println("Nhập tên học sinh : ");
                            scanner.nextLine();
                            String nameWantToFix = scanner.nextLine();
                            System.out.println("Nhập độ tuổi của học sinh :");
                            int ageWantToFix = scanner.nextInt();
                            System.out.println("Nhập số điểm trung bình của học sinh :");
                             int averageMarkWantToFix = scanner.nextInt();
                            Student newStudent = new Student(idWantToFix, nameWantToFix, ageWantToFix, averageMarkWantToFix);
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


