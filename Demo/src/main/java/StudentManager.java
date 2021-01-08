import java.util.ArrayList;

public class StudentManager {

    StudentManagerScanner studentManagerScanner=new StudentManagerScanner();
    StudentScanner studentScanner=new StudentScanner();
    String totalMenu = "1. See List Of Students\n" +
            "2. Add Student\n" +
            "3. Edit Information Student\n" +
            "4. Remove Student\n" +
            "5. Input Score\n" +
            "6. Input All Score\n" +
            "7. Edit Score\n" +
            "8. Edit All Score\n" +
            "9. Sort The List(Up To Down)\n" +
            "0. Exit\n";

    String editMenu = "1. Edit Name\n" +
            "2. Edit Day Of Birth\n" +
            "3. Edit Gender\n" +
            "0. Exit\n";

    String inputScoreMenu="1. Input Score 1\n" +
            "2. Input Score 2\n" +
            "3. Input Score 3\n" +
            "4. Input Score 4\n" +
            "0. Exit\n";

    String editScoreMenu="1. Edit Score 1\n" +
            "2. Edit Score 2\n" +
            "3. Edit Score 3\n" +
            "4. Edit Score 4\n" +
            "0. Exit\n";

    String inputAllScoreMenu ="1. Input All Score 1\n" +
            "2. Input All Score 2\n" +
            "3. Input All Score 3\n" +
            "4. Input All Score 4\n" +
            "0. Exit\n";

    String editAllScoreMenu ="1. Edit All Score 1\n" +
            "2. Edit All Score 2\n" +
            "3. Edit All Score 3\n" +
            "4. Edit All Score 4\n" +
            "0. Exit\n";


    private boolean isRunningTotal = true;
    private boolean isRunningEdit = false;
    private boolean isRunningInputScore=false;
    private boolean isRunningEditScore=false;
    private boolean isRunningInputAllScore=false;
    private boolean isRunningEditAllScore=false;
    private Student studentPrivate=null;
    private ArrayList<Student> studentListPrivate=new ArrayList<>();


    public void printTotalMenu() {
        while (isRunningTotal) {
            int optionTotalMenu = studentManagerScanner.getOptionMenu(totalMenu, 9,"----------Menu----------\n");
            handleGetTotalMenu(optionTotalMenu);
        }
    }

    public void handleGetTotalMenu(int optionTotalMenu){
        switch (optionTotalMenu) {
            case 1 -> studentScanner.handledShowAllListStudent();
            case 2 -> studentScanner.handleAddStudentToList();
            case 3 -> {
                isRunningEdit = true;
                studentPrivate = studentScanner.handleEditStudent();
                checkStudentPrivateAndPrintEditMenu(studentPrivate);
            }
            case 4 -> studentScanner.handleRemoveStudent();
            case 5 -> {
                isRunningInputScore = true;
                studentPrivate = studentScanner.handleInputPointStudent();
                checkStudentPrivateAndPrintInputScoreMenu(studentPrivate);
            }
            case 6 ->{
                isRunningInputAllScore=true;
                studentListPrivate =studentScanner.getListToInputAllScore();
                checkStudentPrivateAndPrintInputAllScoreMenu(studentListPrivate);
            }
            case 7 -> {
                isRunningEditScore = true;
                studentPrivate = studentScanner.handleInputPointStudent();
                checkStudentPrivateAndPrintEditScoreMenu(studentPrivate);
            }
            case 8 ->{
                isRunningEditAllScore=true;
                studentListPrivate =studentScanner.getListToInputAllScore();
                checkStudentPrivateAndPrintEditAllScoreMenu(studentListPrivate);
            }
            case 9 ->{
                studentScanner.handleSortList();
            }
            case 0 -> isRunningTotal = false;
        }
    }

    public void checkStudentPrivateAndPrintEditMenu(Student studentPrivate){
        if(studentPrivate !=null){
            printEditMenu(studentPrivate);
        }else {
            isRunningEdit=false;
        }
    }

    public void printEditMenu(Student studentPrivate){
        while (isRunningEdit){
            int optionEditMenu= studentManagerScanner.getOptionMenu(editMenu,3,"----------Edit----------\n");
            handleGetEditMenu(studentPrivate,optionEditMenu);
        }
    }

    public void handleGetEditMenu(Student studentPrivate,int optionEditMenu){
        switch (optionEditMenu) {
            case 1 -> studentScanner.handleEditFullName(studentPrivate);
            case 2 -> studentScanner.handleEditDOB(studentPrivate);
            case 3 -> studentScanner.handledEditGender(studentPrivate);
            case 0 -> isRunningEdit = false;
        }
    }

    public void checkStudentPrivateAndPrintInputScoreMenu(Student studentPrivate){
        if(studentPrivate !=null){
            printInputScoreMenu(studentPrivate);
        }else {
            isRunningInputScore=false;
        }
    }

    public void printInputScoreMenu(Student studentPrivate){
        while (isRunningInputScore){
            int optionInputScoreMenu= studentManagerScanner.getOptionMenu(inputScoreMenu,4,"----------Input Score----------\n");
            handleGetInputScoreMenu(studentPrivate,optionInputScoreMenu);
        }
    }

    public void handleGetInputScoreMenu(Student studentPrivate,int optionInputScoreMenu){
        switch (optionInputScoreMenu) {
            case 1 -> studentScanner.handleInputScore1(studentPrivate);
            case 2 -> studentScanner.handleInputScore2(studentPrivate);
            case 3 -> studentScanner.handleInputScore3(studentPrivate);
            case 4 -> studentScanner.handleInputScore4(studentPrivate);
            case 0 -> isRunningInputScore = false;
        }
    }

    public void checkStudentPrivateAndPrintEditScoreMenu(Student studentPrivate){
        if(studentPrivate !=null){
            printEditScoreMenu(studentPrivate);
        }else {
            isRunningEditScore=false;
        }
    }

    public void printEditScoreMenu(Student studentPrivate){
        while (isRunningEditScore){
            int optionEditScoreMenu= studentManagerScanner.getOptionMenu(editScoreMenu,4,"----------Edit Score----------\n");
            handleGetEditScoreMenu(studentPrivate,optionEditScoreMenu);
        }
    }

    public void handleGetEditScoreMenu(Student studentPrivate,int optionEditScoreMenu){
        switch (optionEditScoreMenu) {
            case 1 -> studentScanner.handleEditScore1(studentPrivate);
            case 2 -> studentScanner.handleEditScore2(studentPrivate);
            case 3 -> studentScanner.handleEditScore3(studentPrivate);
            case 4 -> studentScanner.handleEditScore4(studentPrivate);
            case 0 -> isRunningEditScore = false;
        }
    }

    public void checkStudentPrivateAndPrintInputAllScoreMenu(ArrayList<Student> studentListPrivate){
        if(studentListPrivate.size() !=0){
            printInputAllScoreMenu(studentListPrivate);
        }else {
            isRunningEditScore=false;
        }
    }

    public void printInputAllScoreMenu(ArrayList<Student> studentListPrivate){
        while (isRunningInputAllScore){
            int optionInputAllScoreMenu= studentManagerScanner.getOptionMenu(inputAllScoreMenu,4,"----------Input All Score----------\n");
            handleGetInputAllScoreMenu(studentListPrivate,optionInputAllScoreMenu);
        }
    }

    public void handleGetInputAllScoreMenu(ArrayList<Student> studentListPrivate,int optionInputAllScoreMenu){
        switch (optionInputAllScoreMenu) {
            case 1 -> studentScanner.handleInputAllScore1(studentListPrivate);
            case 2 -> studentScanner.handleInputAllScore2(studentListPrivate);
            case 3 -> studentScanner.handleInputAllScore3(studentListPrivate);
            case 4 -> studentScanner.handleInputAllScore4(studentListPrivate);
            case 0 -> isRunningInputAllScore = false;
        }
    }

    public void checkStudentPrivateAndPrintEditAllScoreMenu(ArrayList<Student> studentListPrivate){
        if(studentListPrivate.size() !=0){
            printEditAllScoreMenu(studentListPrivate);
        }else {
            isRunningEditScore=false;
        }
    }

    public void printEditAllScoreMenu(ArrayList<Student> studentListPrivate){
        while (isRunningInputAllScore){
            int optionInputAllScoreMenu= studentManagerScanner.getOptionMenu(editAllScoreMenu,4,"----------Edit All Score----------\n");
            handleGetEditAllScoreMenu(studentListPrivate,optionInputAllScoreMenu);
        }
    }

    public void handleGetEditAllScoreMenu(ArrayList<Student> studentListPrivate,int optionInputAllScoreMenu){
        switch (optionInputAllScoreMenu) {
            case 1 -> studentScanner.handleEditAllScore1(studentListPrivate);
            case 2 -> studentScanner.handleEditAllScore2(studentListPrivate);
            case 3 -> studentScanner.handleEditAllScore3(studentListPrivate);
            case 4 -> studentScanner.handleEditAllScore4(studentListPrivate);
            case 0 -> isRunningInputAllScore = false;
        }
    }
}
