package day;
/**
 * @description  最小倍数
 * 2520是最小的能够被1到10整除的数。
 * 最小的能够被1到20整除的正数是多少？
 * 思想：其实就是求1到20的最小公倍数，1到n的最小公倍数也是n*(n-1)的倍数，
 * 通过不断的乘以n*(n-1)的倍数来判断，如果1到n都能被他整除，则直接返回。
 *
 * @author  LT
 * @date  2020/7/14
 */
public class Day03 {

    public static int smallestMultiple(int num) {
        int product = num * (num-1);
        int m = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            m = product * i;
            for (int j = 2; j <= num; j++) {
                if (m%j != 0) {
                    break;
                }
                if (j == num) {
                    return m;
                }
            }
        }
        return m;
    }

    public static void main(String[] args) {
        // 232792560
        System.out.println(smallestMultiple(20));
    }

}
