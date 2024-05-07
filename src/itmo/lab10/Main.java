package itmo.lab10;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("files/text");
        //lessons1
        for (String sts : readText(file1)) {
            System.out.println(sts);
        }

        //lessons2
        String p1 = "Всем доброго дня!";
        saveText(p1);

        //lessons3
        File file2 = new File("files/text2");
        stickText(file1, file2);

        //lessons4
        reapliceText(file1);

    }

    public static List<String> readText(File file1) {

        List<String> listLine = new ArrayList<String>();

        try (BufferedReader bf = new BufferedReader(new FileReader(file1))) {

            String line = bf.readLine();

            while (line != null) {
                listLine.add(line);
                line = bf.readLine();
            }

            bf.close();
        } catch (IOException e) {
            System.err.println(e);
        }

        return listLine;
    }

    public static void saveText(String p1) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/output.txt"))) {

            bw.write(p1);
            bw.close();

        } catch (IOException e) {
            System.err.println(e);
        }

    }

    public static void stickText(File file1, File file2) {

        try (BufferedReader bf1 = new BufferedReader(new FileReader(file1));
             BufferedReader bf2 = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter("files/lessons3.txt"))) {

            String line = bf1.readLine();

            while (line != null) {
                bw.write(line);
                bw.newLine();
                line = bf1.readLine();
            }
            String line2 = bf2.readLine();

            while (line2 != null) {
                bw.write(line2);
                bw.newLine();
                line2 = bf2.readLine();
            }

            bf1.close();
        } catch (IOException e) {
            System.err.println(e);
        }

    }

    public static void reapliceText(File file1) {

        InputStream is = null;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/lessons4.txt"))) {

            is = new FileInputStream(file1);

            Scanner fileScan = new Scanner(is);

            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                line = line.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "\\$");
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println(e);
        }

    }

}
