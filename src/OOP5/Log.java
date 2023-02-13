package OOP5;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

class Log {

    public Log() {
    }

    public void record(String msg) {
        Date date = new Date();
        Path path = Paths.get("C:\\Users\\Asus\\IdeaProjects\\OOP5\\src\\OOP5\\log.txt");
        try (FileWriter writer = new FileWriter(path.toString(), true)) {

            writer.write(msg);
            writer.write(date.toString());
            writer.write('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}