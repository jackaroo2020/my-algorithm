package day;
/**
 * @description  最大质数因子
 *               思想：通过不断的递归调用，判断number是否为质数。
 * @author  LT
 * @date  2020/7/13
 */
public class Day01 {

    public static long primeFactory(long number) {
        if (number == 1) {
            return 1;
        }
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                return primeFactory(number/i);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        // 6857
        System.out.println(primeFactory(600851475143L));
    }
}
