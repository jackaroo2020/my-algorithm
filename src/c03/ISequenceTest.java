package c03;
/**
 * @description  Java 实现顺序表的基本操作
 *
 * @author  LT
 * @date  2020/4/19
 */
public class ISequenceTest {
    public static void main(String[] args) {
        // add test
        ISequence sequence = new ISequenceImpl();
        for (int i = 0; i < 10; i++) {
            sequence.add(i, i);
        }
        System.out.println("在最大值10的范围内插入数据：");
        sequence.display();
        System.out.println();
        // 扩容
        for (int i = 10; i < 20; i++) {
            sequence.add(i,i);
        }
        System.out.println("扩容：");
        sequence.display();
        System.out.println();

        System.out.println("随机位置插入数据：");
        sequence.add(9,"list");
        sequence.display();
        System.out.println();

        System.out.println("search查找一个数据："+sequence.search("list"));
        System.out.println("contains查找一个数据："+sequence.contains("list"));
        System.out.println();

        System.out.println("查找某一个位置对应的值："+sequence.indexOf(9));
        System.out.println();

        System.out.println("删除一个数据："+sequence.remove(8));
        sequence.display();
        System.out.println();

        System.out.println("得到顺序表的长度:"+sequence.size());
    }

}
