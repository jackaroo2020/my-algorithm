package practice;
/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/5/13
 */
public interface IArrayDemo {

   int add(int pos, Object obj);

   int remove(Object key);

   Object indexOf(int pos);

   int search(Object key);

   boolean contains(Object key);

   void display();

   int size();

   boolean isEmpty();

   void clear();

   boolean isFull();
}
