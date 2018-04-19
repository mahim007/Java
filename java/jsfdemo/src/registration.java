import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by mahim on 21-Oct-17.
 */

@ManagedBean(name = "mahim")
public class registration {
    private String lastname;
    private String firstname;
    private String dept;
    private String gender;
    private String major;
    private String[] minor;
    private String[] hobby;
    private String remarks;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String[] getMinor() {
        return minor;
    }

    public void setMinor(String[] minor) {
        this.minor = minor;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getResponse(){
        if (lastname==null) return "";
        else{
            String allminor="";
            for (String s:minor){
                allminor+=s+", ";
            }

            String allhobby="";
            for (String s:hobby){
                allhobby+=s+ ", ";
            }

            return "<p style=\"color:red\"> You Entered <br>" +
                    "Last Name: "+ lastname +"<br>" +
                    "First Name: " + firstname + "<br>" +
                    "gender: "+ gender + "<br>" +
                    "Major: "+ major + "<br>" +
                    "Minor: "+ allminor + "<br>" +
                    "Hobby: "+allhobby + "<br>" +
                    "Remarks: "+remarks + "<br>";
        }
    }
}
