import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Reader in;
            BufferedReader br = new BufferedReader(new FileReader("File.txt"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println(country[4] + ":" + country[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
