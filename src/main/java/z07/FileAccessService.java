package z07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/*
w teście jednostkowym będziemy robic atrapę tej klasy
 */
public class FileAccessService {

private String path;

    public FileAccessService(String path) {
        this.path = path;
    }

    public List<String> loadAllLines() throws IOException {
        Path p = Paths.get(path);
        return Files.readAllLines(p);
    }


}
