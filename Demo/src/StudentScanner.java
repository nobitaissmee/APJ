import java.util.ArrayList;

public class StudentScanner {
    static StudentFormat studentFormat = new StudentFormat();
    static StudentController studentController = new StudentController();

    public void handleAddStudentToList() {
        String fullName = studentFormat.getName("Write your full name:");
        String dOB = studentFormat.getFormatDOB("Write your day of birth:");
        String gender = studentFormat.getFormatGender("Write your gender:");
        studentController.addStudentToList(fullName, gender, dOB);
    }

    public void handledShowAllListStudent() {
        studentController.showAllStudentList();
    }

    public void showListFindByName(ArrayList<Student> studentFind) {
        int length = studentController.checkLengthOfName(studentFind);
        for (Student student : studentFind) {
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

    public Student handleEditStudent() {
        String nameEdit = studentFormat.getNameEdit("Write your name want to edit:");
        ArrayList<Student> studentFind = studentController.FindStudentByName(nameEdit);
        if (studentFind.size() == 0) {
            System.out.println("Not found student with this name!");
            return null;
        } else {
            showListFindByName(studentFind);
            int idEdit = studentFormat.getIdEdit("Write your id want to remove:");
            int idEditCurrent = studentController.getIdStudentFromListFind(studentFind, idEdit);
            if (idEditCurrent == -1) {
                System.out.println("No found student with this id!");
                return null;
            } else {
                showListFindByName(studentFind);
                Student studentEdit = studentController.getStudentById(idEditCurrent);
                return studentEdit;
            }
        }
    }

    public void handleEditFullName(Student studentEdit) {
        String nameEdit = studentFormat.getNameEdit("Write your name want to replace:");
        studentController.editStudentFullName(studentEdit, nameEdit);
    }

    public void handleEditDOB(Student studentEdit) {
        String dOBEdit = studentFormat.getFormatDOB("Write your day of birth want to replace:");
        studentController.editStudentDOB(studentEdit, dOBEdit);
    }

    public void handledEditGender(Student studentEdit) {
        String genderEdit = studentFormat.getFormatGender("Write your gender want to replace:");
        studentController.editStudentGender(studentEdit, genderEdit);
    }


    public void handleRemoveStudent() {
        String nameRemove = studentFormat.getNameEdit("Write your name want to remove:");
        ArrayList<Student> studentFind = studentController.FindStudentByName(nameRemove);
        if (studentFind.size() == 0) {
            System.out.println("Not found student with this name!");
        } else {
            showListFindByName(studentFind);
            int idRemove = studentFormat.getIdEdit("Write your id want to remove:");
            int idRemoveCurrent = studentController.getIdStudentFromListFind(studentFind, idRemove);
            if (idRemoveCurrent == -1) {
                System.out.println("No found student with this id!");
            } else {
                removeStudent(idRemoveCurrent);
            }
        }
    }

    public void removeStudent(int idRemoveCurrent) {
        Student studentRemove = studentController.getStudentById(idRemoveCurrent);
        studentController.removeStudentFromList(studentRemove);
    }

    public Student handleInputPointStudent() {
        String nameInputPoint = studentFormat.getNameEdit("Write your name want to edit:");
        ArrayList<Student> studentFind = studentController.FindStudentByName(nameInputPoint);
        if (studentFind.size() == 0) {
            System.out.println("Not found student with this name!");
            return null;
        } else {
            showListFindByName(studentFind);
            int idInputPoint = studentFormat.getIdEdit("Write your id want to input:");
            int idInputScoreCurrent = studentController.getIdStudentFromListFind(studentFind, idInputPoint);
            if (idInputScoreCurrent == -1) {
                System.out.println("No found student with this id!");
                return null;
            } else {
                showListFindByName(studentFind);
                Student studentEdit = studentController.getStudentById(idInputScoreCurrent);
                return studentEdit;
            }
        }
    }

    public void handleInputScore1(Student studentInput) {
        if (studentInput.getPoint().getPoint1() != -1) {
            System.out.println("Point has been set!");
        } else {
            double score1Input = studentFormat.getPoint("Input your score want to set up:");
            studentController.inputScore1Student(studentInput, score1Input);
        }
    }

    public void handleInputScore2(Student studentInput) {
        if (studentInput.getPoint().getPoint2() != -1) {
            System.out.println("Point has been set!");
        } else {
            double score2Input = studentFormat.getPoint("Input your score want to set up:");
            studentController.inputScore2Student(studentInput, score2Input);
        }
    }

    public void handleInputScore3(Student studentInput) {
        if (studentInput.getPoint().getPoint3() != -1) {
            System.out.println("Point has been set!");
        } else {
            double score3Input = studentFormat.getPoint("Input your score want to set up:");
            studentController.inputScore1Student(studentInput, score3Input);
        }
    }

    public void handleInputScore4(Student studentInput) {
        if (studentInput.getPoint().getPoint4() != -1) {
            System.out.println("Point has been set!");
        } else {
            double score4Input = studentFormat.getPoint("Input your score want to set up:");
            studentController.inputScore1Student(studentInput, score4Input);
        }
    }

    public void handleEditScore1(Student studentEdit) {
        if (studentEdit.getPoint().getPoint1() == -1) {
            System.out.println("Point not set up!");
        } else {
            double score1Edit = studentFormat.getPoint("Input your score want to replace:");
            studentController.inputScore1Student(studentEdit, score1Edit);
        }
    }

    public void handleEditScore2(Student studentEdit) {
        if (studentEdit.getPoint().getPoint2() == -1) {
            System.out.println("Point not set up!");
        } else {
            double score2Edit = studentFormat.getPoint("Input your score want to replace:");
            studentController.inputScore2Student(studentEdit, score2Edit);
        }
    }

    public void handleEditScore3(Student studentEdit) {
        if (studentEdit.getPoint().getPoint3() == -1) {
            System.out.println("Point not set up!");
        } else {
            double score3Edit = studentFormat.getPoint("Input your score want to replace:");
            studentController.inputScore3Student(studentEdit, score3Edit);
        }
    }

    public void handleEditScore4(Student studentEdit) {
        if (studentEdit.getPoint().getPoint4() == -1) {
            System.out.println("Point not set up!");
        } else {
            double score4Edit = studentFormat.getPoint("Input your score want to replace:");
            studentController.inputScore4Student(studentEdit, score4Edit);
        }
    }

    public ArrayList<Student> getListToInputAllScore1(){
        ArrayList<Student> studentList=studentController.returnListStudent();
        return studentList;
    }

    public void handleAddAllScore1(ArrayList<Student> studentList){
        for(Student student:studentList){
            if (student.getPoint().getPoint1()==-1){
                System.out.println("Point has been set!");
            }else {
                double scoreInput=studentFormat.getPoint("Input your score want to set up for" +student.getFullName()+":");
                studentController.inputScore1Student(student,scoreInput);
            }
        }
    }

    public void handleAddAllScore2(ArrayList<Student> studentList){
        for(Student student:studentList){
            if (student.getPoint().getPoint2()==-1){
                System.out.println("Point has been set!");
            }else {
                double scoreInput=studentFormat.getPoint("Input your score want to set up for" +student.getFullName()+":");
                studentController.inputScore2Student(student,scoreInput);
            }
        }
    }

    public void handleAddAllScore3(ArrayList<Student> studentList){
        for(Student student:studentList){
            if (student.getPoint().getPoint3()==-1){
                System.out.println("Point has been set!");
            }else {
                double scoreInput=studentFormat.getPoint("Input your score want to set up for" +student.getFullName()+":");
                studentController.inputScore3Student(student,scoreInput);
            }
        }
    }

    public void handleAddAllScore4(ArrayList<Student> studentList){
        for(Student student:studentList){
            if (student.getPoint().getPoint4()==-1){
                System.out.println("Point has been set!");
            }else {
                double scoreInput=studentFormat.getPoint("Input your score want to set up for" +student.getFullName()+":");
                studentController.inputScore4Student(student,scoreInput);
            }
        }
    }
}
