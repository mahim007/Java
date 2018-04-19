import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;

/**
 * Created by mahim on 18-Oct-17.
 */
@ManagedBean(name = "mofa")
public class TimeBean {
    public String gettime(){
        return new Date().toString();
    }
}
