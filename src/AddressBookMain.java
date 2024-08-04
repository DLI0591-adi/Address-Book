import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        Scanner sc=new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean flag=true;
        System.out.println("Choose a option of your Choice");
        do{
            System.out.println("1 to create a AddressBook");
            System.out.println("2 to add a Contact");
            System.out.println("3 to Edit a Contact");
            System.out.println("0 to exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("Enter the name of AddressBook ");
                    String bookName=sc.next();
                    sc.nextLine();
                    if(addressBook.isPresent(bookName)) {
                        System.out.println("AddressBook already present!");
                    }
                    else {
                        addressBook.addAddressBook(bookName);
                    }
                    break;
                case 2:
                    System.out.print ("Enter the name of AddressBook to add contact ");
                     bookName = sc.next();
                    sc.nextLine();
                    if(addressBook.isPresent(bookName)) {
                        addressBook.addContact(bookName);
                    }
                    else System.out.println("AddressBook not present");
                    break;
                case 3:
                    System.out.print ("Enter the name of AddressBook to edit contact ");
                    bookName = sc.next();
                    sc.nextLine();
                    if(addressBook.isPresent(bookName)) {
                        addressBook.editContact(bookName);
                    }
                    else System.out.println("AddressBook not present");
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Choose a correct option");
            }
        }while (flag);
    }
}

