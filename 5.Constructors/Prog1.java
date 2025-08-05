class Emp {
    int code;
    String name;
    String course;

    Emp() {
        code = 100;
        name = "VVSKR";
        course = "Java";
    }

    Emp(int code, String name, String course) {
        this.code = code;
        this.name = name;
        this.course = course;
    }

    void showData() {
        System.out.println("Code:" + code);
        System.out.println("Name:" + name);
        System.out.println("Course:" + course);
    }
}

public class Prog1 {
    public static void main(String[] args) {
        Emp emp = new Emp();
        Emp emp1 = new Emp();
        emp.showData();
        emp1.showData();
    }
}
