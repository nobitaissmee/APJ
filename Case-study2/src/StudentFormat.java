import java.sql.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentFormat {
    Scanner sc =new Scanner(System.in);

    public String getName(String message) {
        System.out.println(message);
        System.out.println("The name cannot be numbered or too long");
        String firstName = sc.nextLine();
        Pattern pattern = Pattern.compile("^([A-Za-z\\s]{5,50})");
        Matcher matcher = pattern.matcher(firstName);
        return (matcher.matches()) ? getFormatName(firstName) : getName(message);
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

    public String getNameRemove(String message){
        System.out.println(message);
        try{
            String nameRemove=sc.nextLine();
            return nameRemove;
        }catch (Exception e){
            System.out.println("There are no numbers or special characters!");
            return getNameRemove(message);
        }
    }

    public int getIdRemove(String message){
        System.out.println(message);
        try{
            int idRemove=sc.nextInt();
            sc.nextLine();
            return idRemove;
        }catch (Exception e){
            return getIdRemove(message);
        }
    }
}
