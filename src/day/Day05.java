package day;
/**
 * @description  描述:列出前6个素数，它们分别是2、3、5、7、11和13。我们可以看出，第6个素数是13。
 *                      第10,001个素数是多少？
 *                思想：就是判断是否是素数，然后一个个相加，直到等于10001时为止。
 *                下面的方法是判断是否为素数，2是唯一是偶数的素数，除了2如果为偶数直接返回false，
 *                除了2任何素数都不能被偶数整除，所以下面循环的时候是从3开始，每次加2。
 *
 * @author  LT
 * @date  2020/7/15
 */
public class Day05 {

    public static int first10001_prime(int num) {
        int i = 0;
        for (int j = 2; j < Integer.MAX_VALUE; j++) {
            if (isPrime(j)) {
                i++;
                if (i == num) {
                    return j;
                }
            }
        }
        return -1;
    }

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        if ((x & 1) == 0) {
            return false;
        }
        final int max = (int)Math.sqrt(x);
        for (int i = 3; i <= max; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 104743
        System.out.println(first10001_prime(10001));
    }

}
