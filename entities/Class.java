package entities;

import java.util.List;

public class Class {
    private String subject;
    private List<Student> students;

    public Class(String subject, List<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
