import java.util.ArrayList;

public class StudentController {
    private static final StudentController studentController = new StudentController();
    public int id = 0;

    public static StudentController getController() {
        return studentController;
    }

    private StudentController() {
    }

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Student> studentListFind = new ArrayList<>();


    public boolean checkStudentList() {
        return studentList.size() == 0;
    }

    public void addStudentToList(String fullName, String gender, String dayOfBirth) {
        studentList.add(new Student(++id, fullName, gender, dayOfBirth));
    }

    public void showAllStudentList() {
        if (checkStudentList()) {
            System.out.println("There are no students in the list!");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
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

    public ArrayList<Student> findStudentWithName(String nameFind) {
        if (checkStudentList()) {
            System.out.println("There are no students in the list!");
        } else {
            for (Student student : studentList) {
                if (student.getFullName().toLowerCase().contains(nameFind.toLowerCase())) {
                    studentListFind.add(student);
                }
            }
        }
        return studentListFind;
    }

    public void showListFind(ArrayList<Student> findList) {
        for (Student student : findList) {
            System.out.println(student);
        }
    }


    public int getIdStudentFromListFind(ArrayList<Student> findList, int id) {
        for (Student student : findList) {
            if (student.getId() == id) {
                return id;
            }
        }
        return -1;
    }

    public void removeStudentFromList(Student studentRemove) {
        studentList.remove(studentRemove);
        studentListFind = new ArrayList<>();
    }

    public void editStudentFullName(Student studentEdit, String nameEdit) {
        studentEdit.setFullName(nameEdit);
        studentListFind = new ArrayList<>();
    }

    public void editStudentDOB(Student studentEdit, String dOBEdit) {
        studentEdit.setDayOfBirth(dOBEdit);
        studentListFind = new ArrayList<>();
    }

    public void editStudentGender(Student studentEdit, String genderEdit) {
        studentEdit.setGender(genderEdit);
        studentListFind = new ArrayList<>();
    }

}
