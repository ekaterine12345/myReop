package ServerSocket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeInFile(String myText) throws IOException {
        FileWriter writer = new FileWriter("info.txt", true);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(myText+"\n");
        buffer.close();
    }
}
