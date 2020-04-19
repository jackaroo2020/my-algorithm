package c03;

import java.util.ArrayList;

/**
 * @description  线性表的顺序结构在Java语言使用的是数组
 *
 * @author  LT
 * @date  2020/4/12
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        System.out.println(list);
        // [11, 21, 31, 41]
        list.add(0,111111);
        System.out.println(list);
        //[111111, 11, 21, 31, 41]
        list.remove(3);
        System.out.println(list);
        //[111111, 11, 21, 41]
    }
}
