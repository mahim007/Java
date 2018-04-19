/**
 * Created by Ashraful Islam Mahim on 1/6/15.
 */
 interface shape {
    public void draw();
}

 class circle implements shape {
    public void circle(){}
    public void draw()
    {
        System.out.println("Hello! I'm in the circle class.");
    }
}

public class interfacetest {
    public static void main(String[] args)
    {
        shape circleshape=new circle();
        circleshape.draw();
    }
}
