package c01;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @description  最常用的Queue实现类是LinkedList，ArrayBlickingQueue, LinkedBlockingQueue，PriorityQueue, PriorityBlockingQueue。
 *
 * @author  LT
 * @date  2020/7/12
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
    }
}
