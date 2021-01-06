public class Student {
    private int id;
    private String fullName;
    private String dayOfBirth;
    private String gender;
    private Point point=new Point();

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", point=" + point +
                '}';
    }

    public boolean checkGPA(){
        return getPoint().getPoint1() ==-1 && getPoint().getPoint2()==-1 && getPoint().getPoint3()==-1 & getPoint().getPoint4() ==-1;
    }

    public void printStudent(){
        System.out.format("%-3d |",id);
        System.out.format("%-50s |",fullName);
        System.out.format("%-13s |",dayOfBirth);
        System.out.format("%-8s |",gender);
        System.out.format("%-8s |",getPoint().getPoint1()!=-1?point.getPoint1():"");
        System.out.format("%-8s |",getPoint().getPoint2()!=-1?point.getPoint2():"");
        System.out.format("%-8s |",getPoint().getPoint3()!=-1?point.getPoint3():"");
        System.out.format("%-8s |",getPoint().getPoint4()!=-1?point.getPoint4():"");
        if(!checkGPA()) {
            System.out.format("%-8.2f |", getPoint().getGPA());
        }else {
            System.out.format("%-8s |","");
        }
        System.out.println();
    }
}
