package practice;

import java.util.Arrays;

/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/5/13
 */
public class IArrayDemoImpl implements IArrayDemo {

    private Object[] elem;

    private int usedSize;

    private static final int  DEFATLT_SIZE = 10;

    public IArrayDemoImpl(){
        this.elem = new Object[DEFATLT_SIZE];
        this.usedSize = 0;
    }

    @Override
    public int add(int pos, Object obj) {
        if (pos < 0 || pos > this.elem.length) {
            return -1;
        }

        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }

        for (int i = this.usedSize-1;  i > pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = obj;
        this.usedSize ++;
        return 1;
    }

    @Override
    public int remove(Object key) {
        if (isEmpty()) {
            return  -1;
        }

        if (search(key) == -1) {
            return -1;
        }
        int i = 0;
        for (; i < this.elem.length; i++) {
            this.elem[i] = this.elem[i-1];
        }
        this.usedSize--;
        this.elem[i+1] = null;
        return 1;
    }

    @Override
    public Object indexOf(int pos) {
        if (pos<0 || pos >= this.elem.length){
            return null;
        }
        return this.elem[pos];
    }

    @Override
    public int search(Object key) {
        int index = -1;
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i].equals(key)) {
                index = i;
            }
        }
        return index;
    }

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

    @Override
    public void display() {
        for (int i = 0; i < this.elem.length; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.elem.length; i++) {
            this.elem[i] = null;
        }
    }

    @Override
    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }
}
