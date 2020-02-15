package AbstractClassAndInterface;
class P {
    P() {
        System.out.println("P: " + this.hashCode());
    }
}
class C extends P {
    C() {
        System.out.println("C: " + this.hashCode());
    }
}
public class HashCode {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.hashCode());
    }
}
