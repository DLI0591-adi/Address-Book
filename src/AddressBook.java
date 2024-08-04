import java.util.*;

public class AddressBook {

    private final Map<String,List> addressBookMap;
    private List<Contact> contacts = new ArrayList<>();
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
}
