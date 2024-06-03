import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class FileReader {
    public static void main(String[] args) {
        String filePathAndName = "./out/resources/log.txt";
        List<String> fileContent = readFileContent(filePathAndName);
        //printFileContent(fileContent);
        //printFileContentByType(fileContent,"GET");
        //printFileContentByType(fileContent,"POST");
        printFileContentByType(fileContent,"29.11.80.12");
        
    }

    public static List<String> readFileContent(String filePathAndName) {
        List<String> content = new ArrayList<>();
        Path filePath = Paths.get(filePathAndName);
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("File not found.");
            System.exit(1);
        }
        return content;
    }
    
    public static void printFileContentByType(List<String> content, String type) {
        for (String line: content) {
            if (line.contains(type)) {
            System.out.println(line);
            }
        }
    }

    public static void printFileContent(List<String> content) {
        for (String line: content) {
            System.out.println(line);
        }
    }
}
