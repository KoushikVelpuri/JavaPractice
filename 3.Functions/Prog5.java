//The function name is the common and the arguments is different is called functions overloading

public class Prog5 {

    public static int sum(int arg1, int arg2) {
        return (arg1 + arg2);
    }

    public static int sum(int arg1, int arg2, int arg3) {
        return (arg1 + arg2 + arg3);
    }

    public static int sum(int arg1, int arg2, int arg3, int arg4) {
        return (arg1 + arg2 + arg3 + arg4);
    }

    public static float sum(int arg1, float arg2) {
        return (arg1 + arg2);
    }

    public static float sum(float arg1, int arg2) {
        return (arg1 + arg2);
    }

    public static float sum(float arg1, float arg2) {
        return (arg1 + arg2);
    }

    public static void main(String[] args) {
        System.out.println("int+int=" + sum(45, 56));
        System.out.println("int+float=" + sum(45, 56.56f));
        System.out.println("float+int=" + sum(56.56f, 56));
        System.out.println("float+int=" + sum(56.56f, 56.45f));
        System.out.println("int+int+int=" + sum(45, 56, 56));

    }

}