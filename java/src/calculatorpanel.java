import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
 class calculatorpanel extends Panel implements ActionListener {
    private TextField display;
    private double arg=0;
    private String op="=";
    private boolean start=true;

    public calculatorpanel()
    {
        setLayout(new BorderLayout());
        display=new TextField("0");
        display.setEditable(false);
        add(display,"North");

        Panel p=new Panel();
        p.setLayout(new GridLayout(4,4));
        String buttons="123/456*789-0.=+";

        for(int i=0;i<buttons.length();i++)

            addbutton(p,buttons.substring(i,i+1));
            add(p,"Center");
        }

    private void addbutton(Container c,String s)
    {
        Button b=new Button(s);
        c.add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt)
        {
            String s=evt.getActionCommand();
            if('0'<=s.charAt(0)&& s.charAt(0)<='9' || s.equals("."))
            {
                if(start)
                {
                    display.setText(s);
                }
                else
                    display.setText(display.getText()+s);
                start=false;
            }

            else
            {
                if(start)
                {
                    if(s.equals("-"))
                    {
                        display.setText(s);
                        start=false;
                    }

                    else
                        op=s;
                }

                else
                {
                    double x=Double.parseDouble(display.getText());
                    calculate(x);
                    op=s;
                    start=true;
                }
            }
        }
    public void calculate(double n)
    {
        if(op.equals("+"))
            arg=arg+n;
        else if(op.equals("-"))
            arg=arg-n;
        else if(op.equals("*"))
            arg=arg*n;
        else if(op.equals("/"))
            arg=arg/n;
        else if(op.equals("="))
            arg=n;

        display.setText(""+arg);
    }
}


