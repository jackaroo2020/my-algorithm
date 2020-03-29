package c02;

import java.math.BigInteger;

/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/3/29
 */
public class BigIntegerDemo {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("1234465");
        BigInteger b = new BigInteger("35435435");
        BigInteger c = a.add(b);

        System.out.println(c);
    }
}
