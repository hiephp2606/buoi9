package entities;

public class Techmaster {
    private String manager;
    private String managerStudent;
    private Class className;

    public Techmaster(String manager, String managerStudent, Class className) {
        this.manager = manager;
        this.managerStudent = managerStudent;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "manager='" + manager + '\'' +
                ", managerStudent='" + managerStudent + '\'' +
                ", className=" + className +
                '}';
    }
}
