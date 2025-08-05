
/*filter the files*/
import java.io.*;

public class Prog4 {
    public static void main(String a[]) {
        File file = new File("E:\\javapractice\\14.files");
        String[] files = file.list(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        // if(name.toLowerCase().endsWith(".txt"))
                        if (name.startsWith("test")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                });

        for (String f : files) {
            System.out.println(f);
        }

    }
}