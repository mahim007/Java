/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import javafx.scene.chart.PieChart;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.jboss.weld.executor.DaemonThreadFactory;

/**
 *
 * @author mahim
 */
@Named(value = "timeBean")
@RequestScoped
public class TimeBean {

    /**
     * Creates a new instance of TimeBean
     */
    public TimeBean() {
    }
    
    public String getTime(){
        return new Date().toString();
    }
    
}
