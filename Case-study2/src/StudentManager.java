import java.util.ArrayList;

public class StudentManager {

    private static final StudentManager studentManager = new StudentManager();

    public static StudentManager getStudentManager() {
        return studentManager;
    }

    private StudentManager() {
    }

    StudentManagerScanner studentManagerScanner = new StudentManagerScanner();
    StudentScanner studentScanner = new StudentScanner();
    StudentController studentController = StudentController.getController();

    String totalMenu = "1. See List Of Students\n" +
            "2. Add Student\n" +
            "3. Edit Information Student\n" +
            "4. Remove Student\n" +
            "0. Exit\n";

    String editMenu = "1. Edit Name\n" +
            "2. Edit Day Of Birth\n" +
            "3. Edit Gender\n" +
            "0. Exit\n";


    private boolean isRunningTotalMenu = true;
    private boolean isRunningEditMenu = true;

    public void printTotalMenu() {
        while (isRunningTotalMenu) {
            int optionTotalMenu = studentManagerScanner.getOptionTotalMenu(totalMenu, 4);
            handleGetTotalMenu(optionTotalMenu);
        }
    }

    public void handleGetTotalMenu(int optionTotalMenu) {
        switch (optionTotalMenu) {
            case 1:
                studentController.showAllStudentList();
                break;
            case 2:
                studentScanner.handleAddStudentToList();
                break;
            case 3:
                isRunningEditMenu = true;
                studentScanner.handleFindStudentByNameToEdit();
            case 4:
                studentScanner.handleFindStudentByNameToRemove();
                break;
            case 0:
                isRunningTotalMenu = false;
        }
    }

    public void printEditMenu(Student studentEdit) {
        while (isRunningEditMenu) {
            int optionEditMenu = studentManagerScanner.getOptionEditMenu(editMenu, 3);
            handleGetEditMenu(optionEditMenu,studentEdit);
        }
    }

    public void handleGetEditMenu(int optionEditMenu, Student studentEdit) {

        switch (optionEditMenu) {
            case 1:
                studentScanner.handleEditStudentFullName(studentEdit);
                break;
            case 2:
                studentScanner.handleEditStudentDOB(studentEdit);
                break;
            case 3:
                studentScanner.handleEditStudentDOB(studentEdit);
            case 4:
                isRunningEditMenu = false;
        }
    }
}
