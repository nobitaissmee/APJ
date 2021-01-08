import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFile {

//        File fileName=new File("data/").mkdirs();

    public void writeCVS(ArrayList<Contact> contactList,String fileName) {
        try (PrintWriter fileWriter = new PrintWriter(fileName)) {
            for (Contact contact : contactList) {
                fileWriter.println(contact);
            }
            System.out.println("Luu CVS thanh cong");
        } catch (IOException e) {
            System.out.println("Luu CVS that bai: " + e.getMessage());
        }
    }

    public List<Contact> readCVS(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            ArrayList<Contact> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                String phoneNumber = parseField(fields[0]);
                String group = parseField(fields[1]);
                String fullName = parseField(fields[2]);
                String gender = parseField(fields[3]);
                String address = parseField(fields[4]);
                String email = parseField(fields[5]);
                String dob = parseField(fields[6]);
                Contact contact =  new Contact(phoneNumber, group, fullName, gender, address, email, dob);
                list.add(contact);
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Doc CVS that bai: " + e.getMessage());
            return null;
        }
    }

    private static String parseField(String field) {
        return field.substring(1, field.length() - 1);
    }
}
