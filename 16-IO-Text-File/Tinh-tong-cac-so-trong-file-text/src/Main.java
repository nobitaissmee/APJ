import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Number.txt"));
            bw.write("5\n");
            bw.write("3\n");
            bw.write("6\n");
            bw.write("1\n");
            bw.write("8\n");
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("Number.txt"));
            int sum = 0;
            String s;
            while ((s = br.readLine()) != null) {
                int value = Integer.parseInt(s);
                sum += value;
            }
            br.close();
            System.out.println("Sum: " + sum);
        } catch (Exception ex) {
            return;
        }
    }
}
