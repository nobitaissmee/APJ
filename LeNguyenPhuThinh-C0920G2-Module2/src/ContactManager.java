public class ContactManager {
    ContactManagerScanner contactManagerScanner = new ContactManagerScanner();
    ContactScanner contactScanner = new ContactScanner();

    String totalMenu = "1. Show All List\n" +
            "2. Add Contact\n" +
            "3. Edit Contact\n" +
            "4. Remove Contact\n" +
            "5. Find Contact\n" +
            "6. Read file\n" +
            "7. Write file\n" +
            "0. Exit\n";

    String findMenu = "1. Find With Phone Number\n" +
            "2. Find With Name\n" +
            "0. Exit\n";

    String warning = "1. Comfim\n" +
            "0. Cancel\n";

    private boolean isRunningTotal = true;
    private boolean isRunningFind = false;
    private boolean isRunningWarning = false;

    public void printTotalMenu() {
        while (isRunningTotal) {
            int optionTotal = contactManagerScanner.getOptionMenu(totalMenu, 7, "---Program Management---");
            getOptionTotalMenu(optionTotal);
        }
    }

    public void getOptionTotalMenu(int optionTotal) {
        switch (optionTotal) {
            case 1:
                contactScanner.handleShowAllContactList();
                break;
            case 2:
                contactScanner.handleAddContactToList();
                break;
            case 3:
                contactScanner.handleEditContactFromList();
                break;
            case 4:
                if (printWarningMenu()) contactScanner.handleRemoveContactFromList();
                break;
            case 5:
                isRunningFind = true;
                printFindMenu();
                break;
            case 6:
                isRunningWarning = true;
                if (printWarningMenu()) contactScanner.handleReadFile();
                break;
            case 7:
                isRunningWarning = true;
                if (printWarningMenu()) contactScanner.handleWriteFile();
                break;
            case 0:
                isRunningTotal = false;
        }
    }

    public void printFindMenu() {
        while (isRunningFind) {
            int optionFind = contactManagerScanner.getOptionMenu(findMenu, 2, "---Find Menu---");
            getOptionFindMenu(optionFind);
        }
    }

    public void getOptionFindMenu(int optionFind) {
        switch (optionFind) {
            case 1:
                contactScanner.handleFindListWithPhoneNumber();
                break;
            case 2:
                contactScanner.handleFindListWithName();
            case 0:
                isRunningFind = false;
        }
    }

    public boolean printWarningMenu() {
        while (isRunningWarning) {
            int optionWarning = contactManagerScanner.getOptionMenu(warning, 1, "--Warning--");
            return getOptionWarningMenu(optionWarning);
        }
        return false;
    }

    public boolean getOptionWarningMenu(int optionWarning) {
        switch (optionWarning) {
            case 1 -> {
                isRunningWarning = false;
                return true;
            }
            case 0 -> {
                isRunningWarning = false;
                return false;
            }
        }
        return false;
    }
}
