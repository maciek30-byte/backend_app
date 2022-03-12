import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main1 {

    public static void main(String[] args) throws IOException {

        File file = new File("someFile.txt");
        int length = (int) file.length();

        try {
            FileInputStream stream = new FileInputStream("someFile.txt");
            InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);

            char[] data = new char[length];
            int readBytes = reader.read(data, 0, length);

            if (readBytes != length) {
                throw new IOException("file loading eroor");
            }

            String text = new String(data);
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
