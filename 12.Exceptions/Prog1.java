import java.io.*;

class Prog1 {
    public static void main(String args[]) {
        DataInputStream dis = new DataInputStream(System.in);
        int a, b, c;
        try {
            System.out.println("Enter A,B values:");
            a = Integer.parseInt(dis.readLine());
            b = Integer.parseInt(dis.readLine());
            c = a + b;
            System.out.println("A=" + a + " B=" + b + " C=" + c);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception Raised:" + ex);
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }
    }
}