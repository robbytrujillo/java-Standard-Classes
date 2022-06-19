package programmer.zaman.now.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("1000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000");
        BigInteger c = a.add(b);

        BigDecimal x = new BigDecimal("10000000000000000000000.100");
        BigDecimal y = new BigDecimal("30000000000000000000000.100");
        BigDecimal z = y.subtract(x);

        System.out.println(c);
        System.out.println(z);
    }
}
