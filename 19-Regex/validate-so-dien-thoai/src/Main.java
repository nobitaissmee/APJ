public class Main {
    private static final String[] phoneNumber = {"(84)-(0978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();

        for (String value : phoneNumber) {
            boolean isvalid = phoneExample.validate(value);
            System.out.println(value + " " + isvalid);

        }
    }
}
