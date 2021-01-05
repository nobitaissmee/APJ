import java.util.ArrayList;

public class StudentScanner {
    StudentFormat studentFormat = new StudentFormat();
    StudentController studentController = StudentController.getController();
    StudentManager studentManager =StudentManager.getStudentManager();

    public void handleAddStudentToList() {
        String fullName = studentFormat.getName("Write your full name:");
        String gender = studentFormat.getFormatGender("Write your gender:");
        String dOB = studentFormat.getFormatDOB("Write your day of birth:");
        studentController.addStudentToList(fullName, gender, dOB);
    }

    public ArrayList<Student> handleFindStudentByName(){
        String nameFind=studentFormat.getNameRemove("Write your name to find:");
        return studentController.findStudentWithName(nameFind);
    }

    public void handleFindStudentByNameToRemove() {
        ArrayList<Student> findList=handleFindStudentByName();
        if (findList.size()==0){
            System.out.println("No has student looking for!");
        }else {
            studentController.showListFind(findList);
            handleFindIdStudentRemove(findList);
        }
    }

    public void handleFindIdStudentRemove(ArrayList<Student> findList) {
        int idFind = studentFormat.getIdRemove("Write your id to remove:");
        int idRemove=studentController.getIdStudentFromListFind(findList,idFind);
        if (idRemove == -1) {
            System.out.println("No has id to found!");
        }else {
            handleRemoveStudent(idRemove);
        }
    }

    public void handleRemoveStudent(int idRemove){
        Student studentRemove=studentController.getStudentById(idRemove);
        if(studentRemove==null){
            System.out.println("No has student to remove!");
        }else {
            studentController.removeStudentFromList(studentRemove);
        }
    }

    public void handleFindStudentByNameToEdit() {
        ArrayList<Student> findList=handleFindStudentByName();
        if (findList.size()==0){
            System.out.println("No has student looking for!");
        }else {
            studentController.showListFind(findList);
            handleFindIdStudentEdit(findList);
        }
    }

    public void handleFindIdStudentEdit(ArrayList<Student> findList) {
        int idFind = studentFormat.getIdRemove("Write your id to remove:");
        int idEdit=studentController.getIdStudentFromListFind(findList,idFind);
        if (idEdit == -1) {
            System.out.println("No has id to found!");
        }else {
            Student studentEdit=studentController.getStudentById(idEdit);
            studentManager.printEditMenu(studentEdit);
        }
    }

//    public void handleEditStudent(Student studentEdit,int choice){
//        switch (choice) {
//            case 1 -> handleEditStudentFullName(studentEdit);
//            case 2 -> handleEditStudentGender(studentEdit);
//            case 3 -> handleEditStudentDOB(studentEdit);
//        }
//    }

    public void handleEditStudentFullName(Student studentEdit){
        String fullNameEdit= studentFormat.getName("Write your full name want to replace:");
        studentEdit.setFullName(fullNameEdit);
    }

    public void handleEditStudentGender(Student studentEdit){
        String genderEdit=studentFormat.getFormatGender("Write your gender want to replace:");
        studentEdit.setGender(genderEdit);
    }

    public void handleEditStudentDOB(Student studentEdit){
        String dOBEdit=studentFormat.getFormatDOB("Write your gender want to replace:");
        studentEdit.setDayOfBirth(dOBEdit);
    }
}
