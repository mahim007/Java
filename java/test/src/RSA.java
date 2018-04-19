import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class RSA {
    public static void main(String[] args) {

        double start=System.nanoTime();///start
        SecureRandom ran=new SecureRandom();
        BigInteger p= BigInteger.probablePrime(256, ran);
        //System.out.println("p="+p);

        BigInteger q= BigInteger.probablePrime(256, ran);
        //System.out.println("q="+q);

        //BigInteger r=BigInteger.probablePrime(256,ran);
        //System.out.println("r="+r);

        //BigInteger s=BigInteger.probablePrime(256,ran);
        //System.out.println("s="+s);

        double end=System.nanoTime();
        double total= ((end-start)/1e6);
        System.out.println("calculation time:"+total);///end


        BigInteger n=p.multiply(q);
        System.out.println("n="+n);

        BigInteger phi=p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1")));
        System.out.println("phi:"+phi);

        BigInteger e;
        while (true){
            BigInteger tmp=new BigInteger(40,ran);
            if (tmp.gcd(phi).equals(new BigInteger("1"))){
                e=tmp;
                break;
            }
        }

        BigInteger d;
        d=e.modInverse(phi);
        System.out.println("e="+e);
        System.out.println("d="+d);

        /*BigInteger f;
        while (true){
            BigInteger tmp=new BigInteger(40,ran);
            if (tmp.gcd(phi).equals(new BigInteger("1"))){
                f=tmp;
                break;
            }
        }

        BigInteger g=f.modInverse(phi);
        System.out.println("f="+f);
        System.out.println("g="+g); */



        BigInteger c=new BigInteger("12321").modPow(e,n);

        System.out.println("cipher="+c);

        BigInteger m=c.modPow(d,n);

        System.out.println("message="+m);


    }
}