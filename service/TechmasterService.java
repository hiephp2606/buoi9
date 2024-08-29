package service;

import entities.Class;
import entities.Student;
import entities.Techmaster;

import java.util.List;
import java.util.Scanner;

public class TechmasterService {
    ClassService classService = new ClassService();
    public Techmaster techmaster (Scanner scanner, List<Student> students) {
        System.out.println("Nhap ten giao vien: ");
        String manager = scanner.nextLine();
        System.out.println("Nhap ten quan ly lop hoc: ");
        String managerStudent = scanner.nextLine();
        System.out.println("Nhap thong tin lop hoc: ");
        Class classroom = classService.inputClass(scanner, students);

        return new Techmaster(manager, managerStudent, classroom);
    }
}
