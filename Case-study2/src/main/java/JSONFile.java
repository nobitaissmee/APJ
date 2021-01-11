import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class JSONFile {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();


    public static void writeJSToFile(List<Student> studentList, String fileName) {
        String json = gson.toJson(studentList);
        try(FileWriter fileWriter=new FileWriter(fileName)) {
            fileWriter.write(json);
        } catch (IOException e) {
            System.out.println("Can't write to file");
        }
    }

    public static List<Student> readJSToFile(String fileName) {
        try {
            String fileStudent=Files.readString(Path.of(fileName));
            Type collectionType = new TypeToken<List<Student>>(){}.getType();
            return gson.fromJson(fileStudent, collectionType);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }
}
