import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("file1.txt");
            FileInputStream fis2 = new FileInputStream("file2.txt");

            int byte1, byte2, count = 0;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println((char)byte1 + " " + (char)byte2);
                }
                count++;
            }

            fis1.close();
            fis2.close();

            System.out.println("Количесво различий: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}