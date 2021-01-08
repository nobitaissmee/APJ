import java.util.ArrayList;

public class ContactController {

    ArrayList<Contact> contactList=new ArrayList<>();
    ArrayList<Contact> contactNumber = new ArrayList<>();
    ArrayList<Contact> contactName = new ArrayList<>();
    CSVFile csvFile=new CSVFile();


    public boolean checkContactList(ArrayList<Contact> contactList) {
        return contactList.size() == 0;
    }

    public ArrayList<Contact> returnContactList(){
        return contactList;
    }

    public void showAllListContact(ArrayList<Contact> contactList) {
        if (checkContactList(contactList)) {
            System.out.println("Contact List is empty!");
        } else {
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }

    public void addNewContactToList(String phoneNumber, String group, String fullName, String gender, String address, String dayOfBirth, String email) {
        contactList.add(new Contact(phoneNumber, group, fullName, gender, address, dayOfBirth, email));
        System.out.println("---Done---");
    }

    public Contact findContactWithNumberPhone(ArrayList<Contact> contactList,String phoneNumberFind) {
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber().equals(phoneNumberFind)) {
                return contact;
            }
        }
        return null;
    }

    public void editContact(Contact contact,String group, String fullName, String gender, String address, String dayOfBirth, String email){
        contact.setGroup(group);
        contact.setFullName(fullName);
        contact.setGender(gender);
        contact.setAddress(address);
        contact.setDayOfBirth(dayOfBirth);
        contact.setEmail(email);
        System.out.println("---Done---");
    }

    public void removeContactFromContactList(Contact contactRemove) {
        contactList.remove(contactRemove);
        System.out.println("---Done---");
    }

    public ArrayList<Contact> findListContactWithPhoneNumber(ArrayList<Contact> contactList,String phoneNumber) {
        if (checkContactList(contactList)) {
            System.out.println("Contact List is empty!");
        } else {
            for (Contact contact : contactList) {
                if (contact.getPhoneNumber().contains(phoneNumber)) {
                    contactNumber.add(contact);
                }
            }
        }
        return contactNumber;
    }

    public ArrayList<Contact> findListContactWithFullName(ArrayList<Contact> contactList,String fullName){
        if(checkContactList(contactList)){
            System.out.println("Contact List is empty!");
        } else {
            for (Contact contact : contactList) {
                if (contact.getFullName().toLowerCase().contains(fullName.toLowerCase())) {
                    contactName.add(contact);
                }
            }
        }
        return contactName;
    }

    public void saveList(ArrayList<Contact> contactList){
        csvFile.writeCVS( contactList,"contacts.csv");
        System.out.println("---Done---");
    }

    public void readList(){
        contactList= (ArrayList<Contact>) csvFile.readCVS("contacts.csv");
        System.out.println("---Done---");
    }
}

