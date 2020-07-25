package day;
/**
 * @description  描述:
 * 毕达哥拉斯三元组是三个自然数a < b < c组成的集合，并满足
 * a2 + b2 = c2
 * 例如，32 + 42 = 9 + 16 = 25 = 52。
 * 有且只有一个毕达哥拉斯三元组满足 a + b + c = 1000。求这个三元组的乘积abc。
 *
 * 思路：
 * 满足毕达哥拉斯定理，可以把它想象成为一个直角三角形的三条边，a是小的直角边，
 * b是大的直角边，c是斜边。b如果等于a，那么c就是无理数了，相加不可能等于1000，所以b不能等于a。
 * 下面的循环要满足直角三角形的几个条件，1：直角边要小于斜边，2：两边之和大于第三边，3：两边之差小于第三边。如果查找到就直接返回。
 *
 * @author  LT
 * @date  2020/7/17
 */
public class Day07 {

    public static int pythagorean(int max) {
        for (int a = 1; a < max / 3; a++) {
            for (int b = a+1; b < max >>1 ; b++) {
               int c = max - a -b;
               if (b < c && (a * a + b * b == c * c)) {
                   return a * b * c;
               }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 31875000
        System.out.println(pythagorean(1000));
    }


}
