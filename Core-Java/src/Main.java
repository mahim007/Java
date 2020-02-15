import AbstractClassAndInterface.Constructor;

public class Main {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Mahim", 13048);
        System.out.println(c1.getName() + " " + c1.getRoll());
        System.out.println(c2.getName() + " " + c2.getRoll());
    }
}
