package day;
/**
 * @description  回文数
 * 回文数就是从前往后和从后往前读都一样的数。由两个2位数相乘得到的最大回文乘积是 9009 = 91 × 99。
 * 找出由两个3位数相乘得到的最大回文乘积。
 * 思想：没啥好的方法，就是通过循环一个个判断。
 *
 * @author  LT
 * @date  2020/7/13
 */
public class Day02 {

    public static int bigPalindrome(){
        int num = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int product = i *j;
                if (product>num && palindrome(product)){
                    num = product;
                }
            }
        }
        return num;
    }

    private static boolean palindrome(int number) {
        int bitCount = 0;
        int[] bit = new int[10];
        // 把数据存放到数组中
       while (number != 0){
            bit[bitCount++] = number%10;
        number /= 10;
    }
        // 数组中判断是否为回文数
        for (int i = 0; i < bitCount >> 1; i++) {
            if (bit[i] != bit[bitCount-i-1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //906609
        System.out.println(bigPalindrome());
    }
}
