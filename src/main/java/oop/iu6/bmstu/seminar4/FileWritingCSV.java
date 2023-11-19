package oop.iu6.bmstu.seminar4;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileWritingCSV {
    public static void main(String[] args) {
        File file = new File("/Users/sigireuven/IdeaProjects/" +
                "UniverOOP2.0/src/main/java/oop/iu6/bmstu/seminar4/file2.csv");
        try(FileOutputStream fos = new FileOutputStream(file)) {
            String str = "x; y \r\n";
            fos.write(str.getBytes(StandardCharsets.UTF_8));
            for (double x = 0; x < Math.PI*2; x+= Math.PI/10) {
                String str2 = (x + ";" + Math.sin(x) + "\r\n").replaceAll("\\.",",");
                fos.write(str2.getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
