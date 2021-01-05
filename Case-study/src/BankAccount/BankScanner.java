package BankAccount;

import Infomation.Information;

public class BankScanner {

    BankFormat bankFormat=new BankFormat();
    BankAccountController bankAccountController=new BankAccountController();

    public void handleAddBankAccount() {
        System.out.println("Write your first name: ");
        String firstName = bankFormat.getName();
        System.out.println("Write your last name: ");
        String lastName = bankFormat.getName();
        System.out.println("Write your gender: ");
        String gender = bankFormat.getFormatGender();
        System.out.println("Write your dayOfBirth: ");
        String dayOfBirth = bankFormat.getFormatDOB();
        System.out.println("Write your phoneNumber: ");
        String phoneNumber = bankFormat.getFormatPhoneNumber();
        System.out.println("Write your address: ");
        String addres = bankFormat.getLine();
        System.out.println("Write your identityCard: ");
        String identityCard = bankFormat.getFormatIdentityCard();
        Information newInformation = new Information(firstName, lastName, gender, dayOfBirth, phoneNumber, addres, identityCard);
        System.out.println("How much money do you want to deposit when you first create?");
        double balance = bankFormat.getBalanceInFirst();
        bankAccountController.addBankAccountToSever(newInformation, balance);
    }

    public void showBankAccountByAccountNumber(){
        System.out.println("Which account number you want to search?");
        String accountNumber=bankFormat.getFormatAccountNumber();
        BankAccount accountFind=bankAccountController.getBankAccountByAccountNumber(accountNumber);
        if(accountFind ==null){
            System.out.println("No account to look for");
        }else {
            System.out.println(accountNumber);
        }
    }

    public void handleRemoveAccountByAccountNumber(){
        System.out.println("Which account number you want to search?");
        String accountNumber=bankFormat.getFormatAccountNumber();
        bankAccountController.removeBankAccountByAccountNumber(accountNumber);
    }

    public void handleDepositToAccount(BankAccount bankAccountDeposit){
        System.out.println("How much money do you want to deposit?");
        double moneyDeposit=bankFormat.getMoneyToDeposit();
        bankAccountController.accountDeposit(moneyDeposit,bankAccountDeposit);
    }

    public void handleWithdrawalFromAccount(BankAccount bankAccountWithdrawal){
        System.out.println("How much money do you want to withdrawal?");
        double moneyWithdrawal=bankFormat.getMoneyToWithdraw();
        bankAccountController.accountWithdrawal(moneyWithdrawal,bankAccountWithdrawal);
    }
}
