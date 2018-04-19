import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 * Created by mahim on 21-Oct-17.
 */
@ManagedBean(name = "bean")
public class guess_number {
    private int num;
    private String guess;

    public int getNum() {
        return num;
    }

    public guess_number() {
        num=(int)(Math.random()*100);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getResponse(){
        if (guess==null) return "";
        else{
            int x=Integer.parseInt(guess);
            if (x<num) return "Too Low";
            else if (x>num) return "Too High";
            else return "You get it!!!";
        }
    }
}
