import java.util.Scanner;

class Emp {
    int code;
    String name;
    String course;
}

public class Prog3 {
    public static void main(String[] args) {
        Emp emp = new Emp();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter code:");
        emp.code = in.nextInt();
        System.out.println("Enter name:");
        emp.name = in.next();
        System.out.println("Enter course:");
        emp.course = in.next();
        System.out.println("Code:" + emp.code);
        System.out.println("Name:" + emp.name);
        System.out.println("Course:" + emp.course);
    }
}
