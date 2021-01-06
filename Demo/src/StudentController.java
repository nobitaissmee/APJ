import java.util.ArrayList;

public class StudentController {
    public int id = 0;

    static ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Student> studentFind = new ArrayList<>();

    public int checkLengthOfName(ArrayList<Student> list) {
        int max = 12;
        for (Student student : list) {
            int lengthStudentName = student.getFullName().length();
            if (lengthStudentName > max) {
                max = lengthStudentName;
            }
        }
        return max;
    }

    public void printTitle() {
        int length = checkLengthOfName(studentList);
        System.out.format("|%-3s |", "ID");
        System.out.format("%-" + length + "s |", "Full Name");
        System.out.format("%-13s |", "Day Of Birth");
        System.out.format("%-8s |", "Gender");
        System.out.format("%-8s |", "Point 1");
        System.out.format("%-8s |", "Point 2");
        System.out.format("%-8s |", "Point 3");
        System.out.format("%-8s |", "Point 4");
        System.out.format("%-8s |", "GPA");
        System.out.println();
    }

    public boolean checkStudentList() {
        return studentList.size() == 0;
    }

    public ArrayList<Student> returnListStudent(){
        if(!checkStudentList()) return studentList;
        return null;
    }

    public void addStudentToList(String fullName, String gender, String dayOfBirth) {
        studentList.add(new Student(++id, fullName, gender, dayOfBirth));
    }

    public void showAllStudentList() {
        if (checkStudentList()) {
            System.out.println("There are no students in the list!");
        } else {
            printTitle();
            int length = checkLengthOfName(studentList);
            for (Student student : studentList) {
                System.out.format("|%-3d |", student.getId());
                System.out.format("%-" + length + "s |", student.getFullName());
                System.out.format("%-13s |", student.getDayOfBirth());
                System.out.format("%-8s |", student.getGender());
                System.out.format("%-8s |", student.getPoint().getPoint1() != -1 ? student.getPoint().getPoint1() : "");
                System.out.format("%-8s |", student.getPoint().getPoint2() != -1 ? student.getPoint().getPoint2() : "");
                System.out.format("%-8s |", student.getPoint().getPoint3() != -1 ? student.getPoint().getPoint3() : "");
                System.out.format("%-8s |", student.getPoint().getPoint4() != -1 ? student.getPoint().getPoint4() : "");
                System.out.format((!student.checkGPA()?"%-8.2f |":"%-8s |"),(!student.checkGPA()?student.getPoint().getGPA():""));
                System.out.println();
            }
        }
    }

    public Student getStudentById(int id) {
        if (checkStudentList()) {
            System.out.println("No student found!");
        } else {
            for (Student student : studentList) {
                if (student.getId() == id) {
                    return student;
                }
            }
        }
        return null;
    }

    public ArrayList<Student> FindStudentByName(String name) {
        if (checkStudentList()) {
            System.out.println("There are no students in the list!");
        } else {
            for (Student student : studentList) {
                if (student.getFullName().toLowerCase().contains(name.toLowerCase())) {
                    studentFind.add(student);
                }
            }
        }
        return studentFind;
    }

    public int getIdStudentFromListFind(ArrayList<Student> findList, int id) {
        for (Student student : findList) {
            if (student.getId() == id) {
                findList.clear();
                return id;
            }
        }
        findList.clear();
        return -1;
    }

    public void editStudentFullName(Student studentEdit, String nameEdit) {
        studentEdit.setFullName(nameEdit);
        studentFind.clear();
    }

    public void editStudentDOB(Student studentEdit, String dOBEdit) {
        studentEdit.setDayOfBirth(dOBEdit);
        studentFind.clear();
    }

    public void editStudentGender(Student studentEdit, String gender) {
        studentEdit.setGender(gender);
        studentFind.clear();
    }

    public void removeStudentFromList(Student studentRemove) {
        studentList.remove(studentRemove);
        studentFind.clear();
    }

    public void inputScore1Student(Student studentInput, double score1Input) {
        studentInput.getPoint().setPoint1(score1Input);
        studentFind.clear();
    }

    public void inputScore2Student(Student studentInput, double score2Input) {
        studentInput.getPoint().setPoint2(score2Input);
        studentFind.clear();
    }

    public void inputScore3Student(Student studentInput, double score3Input) {
        studentInput.getPoint().setPoint3(score3Input);
        studentFind.clear();
    }

    public void inputScore4Student(Student studentInput, double score4Input) {
        studentInput.getPoint().setPoint4(score4Input);
        studentFind.clear();
    }


}
