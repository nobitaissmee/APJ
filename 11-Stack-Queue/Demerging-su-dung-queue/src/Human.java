public class Human {
    public static final String MALE="male";
    public static final String FEMALE="female";

    private String name;
    private String gender;
    private String dayOfBirth;

    public Human(String name, String gender, String dayOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }
}
