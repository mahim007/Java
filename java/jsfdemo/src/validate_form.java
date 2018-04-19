import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by mahim on 21-Oct-17.
 */
@ManagedBean(name = "valid")
public class validate_form {
    private String name;
    private String ssn;
    private String age;
    private String height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getResponse(){
        if(name==null || ssn==null || age==null || height==null) return "";
        else{
            return "<p>You entered <br>"+
                    "Name: " + name +"<br>" +
                    "SSN: " + ssn + "<br>" +
                    "Age: " + age + "<br>" +
                    "Height: " + height;
        }
    }
}
