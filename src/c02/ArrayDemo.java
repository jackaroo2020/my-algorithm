package c02;

import java.util.ArrayList;

/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/3/29
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] array = new int[10];
        array[1] = 222;
        array[2] = 333;
        System.out.println(array[1]);

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(111);
        a1.add(222);
        System.out.println(a1);
    }
}
