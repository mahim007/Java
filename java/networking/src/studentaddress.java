import java.io.Serializable;

/**
 * Created by mahim on 10-Jun-17.
 */
public class studentaddress implements Serializable {
    private String name;
    private String city;
    private String street;
    private String zip;

    public studentaddress(String name, String city, String street, String zip) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
