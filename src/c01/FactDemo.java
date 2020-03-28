package c01;
/**
 * @description  描述
 *
 * @author  LT
 * @date  2020/3/28
 */
public class FactDemo {

    public static int fact(int n){
        if (n ==1) {
            return  1;
        }
        return n*fact(n-1);

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
