import entities.Techmaster;
import service.ClassService;
import service.TechmasterService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        goi ham
        ClassService classService = new ClassService();
        TechmasterService techmasterService = new TechmasterService();

//        system
//        Class classroom = classService.inputClass();
        Techmaster techmaster = techmasterService.techmaster();
    }
}
