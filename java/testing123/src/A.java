public class A {
    int i=10;
    static int k=5;

    public static void main(String[] args) {
        A a=new A();
        System.out.println("i="+a.i);
        System.out.println("k="+A.k);
        a.m1();
    }

    public void m1(){
        int x=10;
        i=i+k+m2(i,k);
        System.out.println("total="+i);
    }

    public static int m2(int i,int k){
        return (int)Math.pow(i,k);
    }
}
