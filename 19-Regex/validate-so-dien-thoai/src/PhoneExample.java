import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGAX="^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneExample(){
        pattern= Pattern.compile(PHONE_REGAX);
    }

    public boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
