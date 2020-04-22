package c03;

/**
 * @description  Java 实现顺序表的基本操作
 *
 * @author  LT
 * @date  2020/4/19
 */
public interface ISequence {

    /**
     * 在 pos 位置插入 val
     *
     * @param pos
     * @param val
     * @return
     */
    boolean add(int pos, Object val);

    /**
     * 查找关键字 key 找到返回 key 的下标，没有返回 -1
     *
     * @param key
     * @return
     */
    int search(Object key);

    /**
     * 查找是否包含关键字 key 是否在顺序表当中
     *
     * @param key
     * @return
     */
    boolean contains(Object key);

    /**
     * 得到 pos 位置的值
     *
     * @param pos
     * @return
     */
    Object indexOf(int pos);

    /**
     * 除第一次出现的关键字 key
     *
     * @param key
     * @return
     */
    Object remove(Object key);

    /**
     * 得到顺序表的长度
     *
     * @return
     */
    int size();

    /**
     * 打印顺序表
     */
    void display();

    /**
     * 清空顺序表以防内存泄漏
     */
    void clear();
}
