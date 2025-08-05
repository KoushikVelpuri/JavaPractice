import java.util.*;

class Father {
    int fcode;
    String fname;

    Father(int fcode, String fname) {
        this.fcode = fcode;
        this.fname = fname;
    }
}

class Child extends Father {
    int code;
    String name;

    Child(int fcode, String fname, int code, String name) {
        super(fcode, fname);
        this.code = code;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Father Details");
        System.out.println("Code:" + fcode + "\nName:" + fname);
        System.out.println("Child Details");
        System.out.println("Code:" + code + "\nName:" + name);
    }
}

class prog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fcode, code;
        String fname, name;
        System.out.println("Enter Father Code:");
        fcode = in.nextInt();
        System.out.println("Enter Father Name:");
        fname = in.next();
        System.out.println("Enter Child Code:");
        code = in.nextInt();
        System.out.println("Enter Child Code:");
        name = in.next();
        Child child = new Child(fcode, fname, code, name);
        child.showDetails();
    }
}