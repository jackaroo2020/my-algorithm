package c03;

import java.util.Arrays;

/**
 * @description  Java 实现顺序表的基本操作
 *
 * @author  LT
 * @date  2020/4/19
 */
public class ISequenceImpl implements ISequence {

    /**
     * 数组元素
     */
    private Object[] elem;
    /**
     *  有效数据个数
     */
    private int usedSize;
    /**
     * 默认大小
     */
    private static final int DEFAULT_SIZE = 10;

    public ISequenceImpl(){
        this.elem = new Object[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    /**
     * 在 pos 位置插入 val
     *
     * @param pos
     * @param val
     * @return
     */
    @Override
    public boolean add(int pos, Object val) {
        // 1. 判断pos位置的合法性
        if (pos<0 || pos > this.elem.length) {
            return  false;
        }

        // 2. 判断是否满了，如果满了，进行扩容
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        // 3. 把pos位置以及之后的数全部向后挪一个位置
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }

        // 4. 在pos位置插入val
        this.elem[pos] = val;

        // 5. 更新长度
        this.usedSize++;

        return true;
    }

    /**
     * 判断是否为满
     *
     * @return
     */
    private boolean isFull() {
        return this.elem.length == this.usedSize;
    }

    /**
     * 查找关键字 key 找到返回 key 的下标，没有返回 -1
     *
     * @param key
     * @return
     */
    @Override
    public int search(Object key) {
        // 1. 判断是否为空
        if (isEmpty()) {
            return -1;
        }

        // 2. 遍历查找
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 判断是否为空
     *
     * @return
     */
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    /**
     * 查找是否包含关键字 key 是否在顺序表当中
     *
     * @param key
     * @return
     */
    @Override
    public boolean contains(Object key) {
        // 1. 判断是否为空
        if (isEmpty()) {
            return false;
        }

        // 2. 遍历查找
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 得到 pos 位置的值
     *
     * @param pos
     * @return
     */
    @Override
    public Object indexOf(int pos) {
        // 1. 判断位置是否合法
        if (pos < 0 || pos >= this.elem.length) {
            return null;
        }

        // 2.位置合法
        return this.elem[pos];
    }

    /**
     * 除第一次出现的关键字 key
     *
     * @param key
     * @return
     */
    @Override
    public Object remove(Object key) {
        // 1. 先查表看有没有这个关键字
        // index:关键字下标
        int index = search(key);
        System.out.println("index--------->"+index);
        // 2. 若表里没有这个关键字
        if (index == -1) {
            return null;
        }

        // 3. 表里有这个关键字
        Object data = this.elem[index];
        int i;
        // 删除第一次出现的关键字 key,把key后面的数全部向前挪一个位置
        for (i = index; i < this.usedSize; i++) {
            elem[i] = elem[i+1];
        }
        this.usedSize--;
        this.elem[i+1] = null;
        return data;
    }

    /**
     * 得到顺序表的长度
     *
     * @return
     */
    @Override
    public int size() {
        return this.usedSize;
    }

    /**
     * 打印顺序表
     */
    @Override
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    /**
     * 清空顺序表以防内存泄漏
     */
    @Override
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            this.elem[i] = null;
        }
    }
}
