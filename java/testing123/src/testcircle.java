/**
 * Created by Ashraful on 03-Apr-18.
 */
public class testcircle {
    public static void main(String[] args) {
        circle c1=new circle();
        circle c2=new circle();

        c1.setradius(1.0);
        c2.setradius(3.4);

        System.out.println("circle 1 area = "+c1.getarea() + " \ncircle 2 area = "+c2.getarea());
    }
}
