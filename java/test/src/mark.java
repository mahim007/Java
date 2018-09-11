import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class mark {
    public static void main(String[] args) {

        double start=System.nanoTime();///start time  for variable generation
        SecureRandom ran=new SecureRandom();
        BigInteger p= BigInteger.probablePrime(256, ran);
        //System.out.println("p="+p);

        BigInteger q= BigInteger.probablePrime(256, ran);
        //System.out.println("q="+q);

        BigInteger r=BigInteger.probablePrime(256,ran);
        //System.out.println("r="+r);

        BigInteger s=BigInteger.probablePrime(256,ran);
        //System.out.println("s="+s);

        double end=System.nanoTime();///end time for variable generation
        double total= ((end-start)/1e6); /// this will provide required time in milli-sec
        System.out.println("prime number generation time:"+total); //this print the total time needed for prime number generation to console
        System.out.println();/// just giving a blank for reading output

        start=System.nanoTime();///start time for processing here we will calculate N, phi(N), etc.... show the algorithm in our paper
        BigInteger n=p.multiply(q).multiply(r).multiply(s);
        System.out.println("n="+n);

        BigInteger phi=p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1"))).multiply(r.subtract(new BigInteger("1"))).multiply(s.subtract(new BigInteger("1")));
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

        BigInteger f;
        while (true){
            BigInteger tmp=new BigInteger(40,ran);
            if (tmp.gcd(phi).equals(new BigInteger("1"))){
                f=tmp;
                break;
            }
        }

        BigInteger g=f.modInverse(phi);
        end=System.nanoTime();///end time for processing
        total= ((end-start)/1e6);
        System.out.println("intermediate processing time:"+total);///this line will print processing time to the console
        System.out.println();/// just giving a blank for reading output

        System.out.println("f="+f);
        System.out.println("g="+g);


        start=System.nanoTime();/// this is the starting point of encryption time
        BigInteger c=new BigInteger("12321").modPow(e,n).modPow(f,n);///encryption formula. here message="12321" is considered just for an example.
        end=System.nanoTime(); /// this is the ending point of encryption time
        total= ((end-start)/1e6);
        System.out.println("total encryption time:"+total); ///this line will print encryption time to the console
        System.out.println();/// just giving a blank for reading output

        System.out.println("cipher="+c);/// this is the cipher :)

        start=System.nanoTime(); /// this is the starting point of decryption time
        BigInteger m=c.modPow(g,n).modPow(d,n); ///decryption formula.
        end=System.nanoTime(); /// this is the ending point of decryption time
        total= ((end-start)/1e6);
        System.out.println("total decryption time:"+total);
        System.out.println();/// just giving a blank for reading output

        System.out.println("message="+m); /// Look, we got back our original message :) :)


    }
}