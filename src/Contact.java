
public class Contact{
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String zip;
    private String phone_no;
    private String email;
    private String state;

    @Override
    public String toString() {
        return "Contact :--> "+
                "\nfirstname='" + firstname + '\'' +
                ", \nlastname='" + lastname + '\'' +
                ", \naddress='" + address + '\'' +
                ", \ncity='" + city + '\'' +
                ", \nstate='" + state + '\'' +
                ", \nzip=" + zip +
                ", \nphone_no=" + phone_no +
                ", \nemail='" + email + '\'' ;
    }

    public Contact() {
    }

    public Contact(String firstname, String lastname, String address, String city, String state, String zip, String phone_no, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_no = phone_no;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}