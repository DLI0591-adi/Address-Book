import java.util.*;

public class AddressBook {

    private final Map<String,List> addressBookMap;
    private List<Contact> contacts = new ArrayList<>();
    Contact c = new Contact();
    Scanner sc=new Scanner(System.in);
    public AddressBook() {
        this.addressBookMap = new HashMap<>();;
    }
    public  boolean isPresent(String bookName) {
        if(addressBookMap.containsKey(bookName))
        {
            return true;
        }
        return false;
    }
    public  void addAddressBook(String bookName) {
        addressBookMap.put(bookName,new ArrayList<>());
        System.out.println(addressBookMap.keySet());
    }
    public  void addContact(String bookName) {
        System.out.print("Fist Name : ");
        String Firstname=sc.nextLine();
        System.out.print("Last Name : ");
        String Lastname=sc.nextLine();
        System.out.print("Address : ");
        String address=sc.nextLine();
        System.out.print("City : ");
        String city=sc.nextLine();
        System.out.print("State : ");
        String state=sc.nextLine();
        System.out.print("Zip : ");
        String zip=sc.nextLine();
        System.out.print("Phone : ");
        String PhoneNumber=sc.nextLine();
        System.out.print("email : ");
        String email=sc.nextLine();
        Contact contact = new Contact(Firstname,Lastname,address,city,state,zip,PhoneNumber,email);
        contacts.add(contact);
        addressBookMap.put(bookName,contacts);
    }

    public void editContact(String bookName) {
        System.out.println("Enter the first name of the contact to be edited: ");
        String n = sc.next();
        List<Contact> list = addressBookMap.get(bookName);
        for(Contact cont : list) {
            if (cont.getFirstname().equals(n))
                edit(cont);
        }
    }

    void edit(Contact cont)
    {
        System.out.println("Choose Details to edit");
        int option;
        boolean flag=true;
        do{
            System.out.println("1 to Edit First Name : ");
            System.out.println("2 to Edit Last Name : ");
            System.out.println("3 to Edit Address : ");
            System.out.println("4 to Edit City : ");
            System.out.println("5 to Edit State : ");
            System.out.println("6 to Edit Zip : ");
            System.out.println("7 to Edit Phone Number : ");
            System.out.println("8 to Edit Email : ");
            System.out.println("9 to finish updating : ");
            option=sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.print("Enter New First Name : ");
                    cont.setFirstname(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter New Last Name : ");
                    cont.setLastname(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter New Address : ");
                    cont.setAddress(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter New City : ");
                    cont.setCity(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter New State : ");
                    cont.setState(sc.nextLine());
                    break;
                case 6:
                    System.out.print("Enter New Zip : ");
                    cont.setZip(sc.nextLine());
                    break;
                case 7:
                    System.out.print("Enter New Phone : ");
                    cont.setPhone_no(sc.nextLine());
                    break;
                case 8:
                    System.out.print("Enter New Email : ");
                    cont.setEmail(sc.nextLine());
                    break;
                case 9:
                    flag=false;
                default:
                    System.out.println("Correct option please");
            }
        }while (flag);
        System.out.println("Contact edited!");
    }

    public void deleteContact(String bookName) {
        System.out.println("Enter the first name of the contact to be deleted: ");
        String n = sc.next();
        List<Contact> list = addressBookMap.get(bookName);
        for (Contact cont : list) {
            if (cont.getFirstname().equals(n))
                contacts.remove(cont);
        }
    }
}
