public class test {
    private int x;

    public test(){
        x=0;
    }

    public test(int y){
        x=y;
    }

    private test(double y){
        x=(int)y;
    }

    public int getX(){
        return x*x;
    }

    public static void main(String[] args) {
        test t1=new test();
        System.out.println("t1="+t1.getX());

        test t2=new test(10);
        System.out.println("t2="+t2.x);

        test t3=new test(12.5);
        System.out.println("t3="+t3.getX());

    }
}
