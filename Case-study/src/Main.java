import BankAccount.BankAccountController;
import StateBank.StateBank;

public class Main {
    public static void main(String[] args) {
        StateBank stateBank=new StateBank();
//        stateBank.printTotalMenu();
        BankAccountController bankAccountController=new BankAccountController();
        bankAccountController.showAllBankAccountList();
    }
}
