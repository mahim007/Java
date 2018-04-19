import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by mahim on 21-Oct-17.
 */

@ManagedBean(name = "calc")
public class calculator {
    private double number1;
    private  double number2;
    private  double result;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void add(){
        result=number1+number2;
    }

    public void subtract(){
        result=number1-number2;
    }

    public void multiply(){
        result=number1*number2;
    }

    public void divide(){
        result=number1/number2;
    }
}
