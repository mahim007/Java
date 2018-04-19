public class C {
    private boolean x=true;
    private int convert(){
        return x ? 1 : -1;
    }

    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.x);
        System.out.println(c.convert());
    }
}
