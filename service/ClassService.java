package service;

import entities.Class;
import entities.Student;

import java.util.List;
import java.util.Scanner;

public class ClassService {
    StudentService studentService = new StudentService();
    public Class inputClass (Scanner scanner, List<Student> students) {
        System.out.println("Nhap ten mon hoc: ");
        String subject = scanner.nextLine();
        String choice;
        do {
            System.out.println("Nhap thong tin thanh vien trong lop: ");
            Student student = studentService.inputStudent(scanner);
            students.add(student);
            System.out.println("Do you want to continues? (Y/N)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y") );


        return new Class(subject, students);
    }
}
