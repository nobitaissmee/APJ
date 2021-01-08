import java.sql.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactFormat {
    Scanner sc = new Scanner(System.in);

    public String getName(String message) {
        System.out.println(message);
        System.out.println("The name cannot be numbered!!!");
        String fullName = sc.nextLine();
        Pattern pattern = Pattern.compile("^([A-Za-z\\s]{1,500})");
        Matcher matcher = pattern.matcher(fullName);
        return (matcher.matches()) ? getFormatName(fullName) : getName(message);
    }

    public String getFormatName(String name) {
        name = name.replaceAll("\\s+", " ").toLowerCase();
        if (name.charAt(0) == ' ') name = name.substring(1);
        String formatName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (int i = 0; i < formatName.length() - 2; i++) {
            if (formatName.charAt(i) == ' ' && formatName.charAt(i + 1) != ' ') {
                String newName = formatName.substring(0, i + 1) + formatName.substring(i + 1, i + 2).toUpperCase() + formatName.substring(i + 2);
                formatName = newName;
            }
        }
        return formatName;
    }

    public String getNameFind(String message) {
        System.out.println(message);
        System.out.println("The name cannot be numbered!!!");
        String fullNameFind = sc.nextLine();
        Pattern pattern = Pattern.compile("^([A-Za-z\\s]{1,500})");
        Matcher matcher = pattern.matcher(fullNameFind);
        return (matcher.matches()) ? fullNameFind : getNameFind(message);
    }

    public String getFormatGender(String message) {
        System.out.println(message);
        System.out.println("Male or Female");
        String gender = sc.nextLine().replaceAll(" ", "");
        String format = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        if (format.equals("Male") || format.equals("Female")) {
            return format;
        } else {
            return getFormatGender(message);
        }
    }

    public String getFormatDOB(String message) {
        System.out.println(message);
        System.out.println("Format DOB (yyyy-mm-dd): ");
        try {
            Date date = Date.valueOf(sc.nextLine());
            return date.toString();
        } catch (Exception e) {
            return getFormatDOB(message);
        }
    }

    public String getFormatPhoneNumber(String message) {
        System.out.println(message);
        System.out.println("Has 10 or 11 numbers: ");
        Pattern pattern = Pattern.compile("^(\\d{10,11})$");
        String phoneNumber = sc.nextLine();
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return phoneNumber;
        } else {
            return getFormatPhoneNumber(message);
        }
    }

    public String getFormatPhoneNumberFind(String message) {
        System.out.println(message);
        Pattern pattern = Pattern.compile("^(\\d{1,11})$");
        String phoneNumber = sc.nextLine();
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return phoneNumber;
        } else {
            return getFormatPhoneNumberFind(message);
        }
    }

    public String getLine(String message){
        System.out.println(message);
        return sc.nextLine();
    }

    public String getFormatEmail(String message){
        System.out.println(message);
        String email=sc.nextLine();
        Pattern p = Pattern.compile("^\\w+@\\w+\\.\\w+$");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return email;
        }else {
            return getFormatEmail(message);
        }
    }

    public static void main(String[] args) {
        ContactFormat contactFormat=new ContactFormat();
        System.out.println(contactFormat.getFormatEmail("Write"));
    }
}
