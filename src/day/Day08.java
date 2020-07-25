package day;
/**
 * @description
 * 描述:
 * 所有小于10的素数的和是2 + 3 + 5 + 7 = 17。
 * 求所有小于两百万的素数的和。
 *
 * 思路：
 * 通过循环把小于2000000的素数相加。
 *
 * @author  LT
 * @date  2020/7/17
 */
public class Day08 {

    public static long summationPrimes(int num) {
        long sum = 2;
        for (int i = 3; i < num; i+=2) {
            if (prime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean prime(int x) {
        final int max = (int)Math.sqrt(x);
        for (int j = 3; j <= max; j+=2) {
            if (x % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 142913828922
        System.out.println(summationPrimes(2000000));
    }
}
