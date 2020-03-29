package others;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/3/29
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("a");
        queue1.offer("b");
        queue1.offer("c");
        queue1.offer("d");
        System.out.println(queue1);

        Queue<String> queue2 = new LinkedList<>();

        List<String> list = new ArrayList<>();
        for (String o : queue1) {
            list.add(o);
        }

        for (int i = list.size()-1; i >=0; i--) {
            queue2.offer(list.get(i));
        }
        System.out.println(queue2);


    }
}
