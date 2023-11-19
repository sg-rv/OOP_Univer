package oop.iu6.bmstu.seminar4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileReadingCSV {
    public static void main(String[] args) {
        ArrayList<Double> x = new ArrayList<>();
        ArrayList<Double> y = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "/Users/sigireuven/IdeaProjects/" +
                "UniverOOP2.0/src/main/java/oop/iu6/bmstu/seminar4/file2.csv"))) {
            bufferedReader.readLine();
            while(bufferedReader.ready()) {
                String[] split = bufferedReader.readLine().split(";");
                x.add(Double.parseDouble(split[0].replaceAll(",", ".")));
                y.add(Double.parseDouble(split[1].replaceAll(",", ".")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("x: ");
        System.out.println(x.stream().map(Object::toString)
                .collect(Collectors.joining("; ", "[", "]")));
        System.out.println("y: ");
        System.out.println(y.stream().map(Object::toString)
                .collect(Collectors.joining("; ", "[", "]")));
    }
}
