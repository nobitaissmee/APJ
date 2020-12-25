import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Writer out;
            BufferedWriter bw=new BufferedWriter(
                    new FileWriter("Write.txt"));
            bw.write("Something\n");
            bw.write("Huy Anh Ngu\n");
            bw.write("Huy Anh Dan\n");
            bw.close();
            Reader in;
            BufferedReader br=new BufferedReader(
                    new FileReader("Write.txt"));
            BufferedWriter bwCopy=new BufferedWriter(
                    new FileWriter("Write-copy.txt"));
            String value;
            while((value=br.readLine())!=null){
                System.out.println(value);
            }
            br.close();
            bwCopy.close();
        }catch(Exception ex){
            return;
        }
    }
}
