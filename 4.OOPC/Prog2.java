class Students {
    int code;
    String name;
    String course;

    public void storeInfo(int code, String name, String course) {
        this.code = code;
        this.name = name;
        this.course = course;
    }

    public void showInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class Prog2 {

    public static void main(String[] args) {
        Students student = new Students();
        student.storeInfo(101, "Ramesh", "Java");
        student.showInfo();

    }

}