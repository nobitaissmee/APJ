import java.util.ArrayList;

public class ContactScanner {
    ContactFormat contactFormat=new ContactFormat();
    ContactController contactController=new ContactController();


    public void handleShowAllContactList(){
        ArrayList<Contact> contactList =contactController.returnContactList();
        contactController.showAllListContact(contactList);
    }

    public void handleAddContactToList(){
        String phoneNumber=contactFormat.getFormatPhoneNumber("Write your phone number want to add:");
        String group=contactFormat.getLine("Write your group want to add:");
        String fullName= contactFormat.getName("Write your full name want to add:");
        String gender=contactFormat.getFormatGender("Write your gender want to add:");
        String address= contactFormat.getLine("Write your address want to add:");
        String dOB= contactFormat.getFormatDOB("Write your day of birth want to add:");
        String email=contactFormat.getFormatEmail("Write your email want to add:");
        contactController.addNewContactToList(phoneNumber,group,fullName,gender,address,dOB,email);
    }

    public void handleEditContactFromList() {
        ArrayList<Contact> contactList = contactController.returnContactList();
        if (contactList.size() == 0) {
            System.out.println("Contact list is empty!");
        } else {
            String phoneNumberEdit = contactFormat.getFormatPhoneNumber("Write your phone number want to edit:");
            Contact contactEdit = contactController.findContactWithNumberPhone(contactList, phoneNumberEdit);
            editContact(contactEdit);
            }
        }

    public void editContact(Contact contactEdit) {
        if (contactEdit == null) {
            System.out.println("Not found contact with phone number!");
        } else {
            String group = contactFormat.getLine("Write your group want to edit:");
            String fullName = contactFormat.getName("Write your full name want to edit:");
            String gender = contactFormat.getFormatGender("Write your gender want to edit:");
            String address = contactFormat.getLine("Write your address want to edit:");
            String dOB = contactFormat.getFormatDOB("Write your day of birth want to edit:");
            String email = contactFormat.getFormatEmail("Write your email want to edit:");
            contactController.editContact(contactEdit, group, fullName, gender, address, dOB, email);
        }
    }

    public void handleRemoveContactFromList(){
        ArrayList<Contact> contactList=contactController.returnContactList();
        if (contactList.size()==0){
            System.out.println("Contact list is empty!!!");
        }else {
            String phoneNumberRemove = contactFormat.getFormatPhoneNumber("Write your phone number want to remove:");
            Contact contactRemove = contactController.findContactWithNumberPhone(contactList, phoneNumberRemove);
            removeContactFromList(contactRemove);
        }
    }

    public void removeContactFromList(Contact contactRemove){
        if(contactRemove==null){
            System.out.println("Not found contact with phone number!");
        }else {
            contactController.removeContactFromContactList(contactRemove);
        }
    }

    public void showListFind(ArrayList<Contact> listFind){
        for (Contact contact:listFind){
            System.out.println(contact);
        }
    }

    public void handleFindListWithPhoneNumber(){
        ArrayList<Contact> contactList=contactController.returnContactList();
        String phoneNumberFind=contactFormat.getFormatPhoneNumberFind("Write your phone number want to find:");
        ArrayList<Contact> contactPhoneNumberList=contactController.findListContactWithPhoneNumber(contactList,phoneNumberFind);
        if(contactPhoneNumberList.size()==0){
            System.out.println("No has found with phone number!");
        }else {
            showListFind(contactPhoneNumberList);
        }
    }

    public void handleFindListWithName(){
        ArrayList<Contact> contactList=contactController.returnContactList();
        String nameFind=contactFormat.getNameFind("Write your name want to find:");
        ArrayList<Contact> contactNameList=contactController.findListContactWithFullName(contactList,nameFind);
        if(contactNameList.size()==0){
            System.out.println("No has found with phone number!");
        }else {
            showListFind(contactNameList);
        }
    }

    public void handleReadFile(){
        contactController.readList();
    }

    public void handleWriteFile(){
        ArrayList<Contact> contactList=contactController.returnContactList();
        contactController.saveList(contactList);
    }
}
