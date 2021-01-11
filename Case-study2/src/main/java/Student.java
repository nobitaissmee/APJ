public class Student {
    private int id;
    private String fullName;
    private String dayOfBirth;
    private String gender;
    private final Point point=new Point();

    public Student() {
    }

    public Student(int id, String fullName,String gender,String dayOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.gender=gender;
        this.dayOfBirth = dayOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Point getPoint() {
        return point;
    }
}
