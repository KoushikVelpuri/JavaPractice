public class Student {
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