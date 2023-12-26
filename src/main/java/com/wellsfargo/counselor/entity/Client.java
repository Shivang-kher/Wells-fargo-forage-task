import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;


    @ManyToOne
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    // Constructors, getters, and setters
    public Client(Advisor advisor, String firstName, String lastName, String address, String phone, String email) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    public Long getClientId() {
        return clientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Advisor Advisor() {
        return advisor;
    }

    public void setFinancialAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
