package sort;

/**
 * @author LT
 * @description 描述:插入排序
 * <p>
 * 思想：
 * 是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * <p>
 * 算法分析：
 * @date 2020/7/22
 */
public class Day03 {

    /**
     * 插入排序
     * 这个每次替换都要定义一个temp赋值需要插入的数，这样会造成不必要的浪费：
     * 所以可以把所有的大于需要插入的数先保存，然后进行比较，然后将最后的正确位置空出来。把之前保存的需要插入的数放到正确位置上
     *
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 保存每次需要插入的那个数
            int temp = arr[i];
            int j;
            //这个较上面有一定的优化
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                // 把大于需要插入的数往后移动。最后不大于temp的数就空出来j
                arr[j] = arr[j - 1];
            }
            //将需要插入的数放入这个位置
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ins = {2, 3, 5, 1, 23, 6, 78, 34};
        int[] ins2 = insertSort2(ins);
        for (int in : ins2) {
            System.out.print(in + " ");
        }

    }
}
