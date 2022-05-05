package d06_FileIO;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        String[] names = {"Jhon", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\d06_FileIO\\output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is another line");

            for (String name : names)
                writer.write("\n" + name);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\d06_FileIO\\output.txt"));

            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
