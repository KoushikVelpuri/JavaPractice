
//Multi-level Inheritance
import java.util.*;

//base Class
class GFather {
    int gcode;
    String gname;

    GFather(int gcode, String gname) {
        this.gcode = gcode;
        this.gname = gname;
    }
}

class Father extends GFather {
    int fcode;
    String fname;

    Father(int gcode, String gname, int fcode, String fname) {
        super(gcode, gname);
        this.fcode = fcode;
        this.fname = fname;
    }
}

// derived class
class Child extends Father {
    int code;
    String name;

    Child(int gcode, String gname, int fcode, String fname, int code, String name) {
        super(gcode, gname, fcode, fname);
        this.code = code;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Grand Father Details");
        System.out.println("Code:" + gcode + "\nName:" + gname);
        System.out.println("Father Details");
        System.out.println("Code:" + fcode + "\nName:" + fname);
        System.out.println("Child Details");
        System.out.println("Code:" + code + "\nName:" + name);

    }

}

class Prog3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int gcode, fcode, code;
        String gname, fname, name;
        System.out.println("Enter Grand Father Code ");
        gcode = in.nextInt();
        System.out.println("Enter Grand Father Name ");
        gname = in.next();
        System.out.println("Enter Father Code ");
        fcode = in.nextInt();
        System.out.println("Enter Father Name ");
        fname = in.next();
        System.out.println("Enter  Code ");
        code = in.nextInt();
        System.out.println("Enter  Name ");
        name = in.next();
        Child child = new Child(gcode, gname, fcode, fname, code, name);
        child.showDetails();
    }
}