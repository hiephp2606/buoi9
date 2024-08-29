package service;

import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent (Scanner scanner) {
        System.out.println("Nhap ten hoc sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi cua hoc sinh: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hoc luc cua hoc sinh: ");
        String classify = scanner.nextLine();

        return new Student(name, age, classify);
    }
}
