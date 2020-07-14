package day;

import java.util.ArrayList;
import java.util.List;

/**
 * @description  描述:完全数是指真因数之和等于自身的那些数。
 * 例如，28的真因数之和为1 + 2 + 4 + 7 + 14 = 28，因此28是一个完全数。
 * 一个数n被称为亏数，如果它的真因数之和小于n；反之则被称为盈数。
 * 由于12是最小的盈数，它的真因数之和为1 + 2 + 3 + 4 + 6 = 16，
 * 所以最小的能够表示成两个盈数之和的数是24。通过数学分析可以得出，
 * 所有大于28123的数都可以被写成两个盈数的和；尽管我们知道最大的不能被写成两个盈数的和的数要小于这个值，
 * 但这是通过分析所能得到的最好上界。
 * 找出所有不能被写成两个盈数之和的正整数，并求它们的和。
 *
 * 思想：先把1到28123之间的盈数存储在list中，然后在逐个判断，其实list中的盈数相当于已经按照从小到大排序好的，
 * 下面的while循环和二分法查找有一点点类似的地方。如果不能表示就加到sum中，最后返回。
 *
 * @author  LT
 * @date  2020/7/14
 */
public class Day04 {

    public static int nonAbundantSums() {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <28123; i++) {
            if (abundant(i)){
                list.add(i);
            }
        }

        for (int i = 0; i < 28123; i++) {
          boolean abundant = false;
          int k = 0;
          int j = list.size() - 1;
          while (k <= j) {
              int value = list.get(k) + list.get(j);
              if (i > value) {
                  k++;
              } else if (i < value) {
                  j--;
              } else {
                  abundant = true;
                  break;
              }
          }
          if (!abundant) {
              sum += i;
          }
        }

        return sum;
    }

    /**
     * 判断num是否为盈数
     *
     * @param num
     * @return
     */
    public static boolean abundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num >> 1; i++) {
            if (num %i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    public static void main(String[] args) {
        // 4179871
        System.out.println(nonAbundantSums());
    }
}
