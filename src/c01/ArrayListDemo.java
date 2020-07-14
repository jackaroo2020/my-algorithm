package c01;

import java.util.ArrayList;
import java.util.List;

/**
 * @description  ArrayList 源码
 *
 * @author  LT
 * @date  2020/7/12
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /**
         * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         * 代码解释:
         * 　　Object src : 原数组
         *     int srcPos : 从元数据的起始位置开始
         * 　　Object dest : 目标数组
         * 　　int destPos : 目标数组的开始起始位置
         * 　　int length  : 要copy的数组的长度
         */
        System.out.println(list.size());
        System.out.println(list);
    }
}
