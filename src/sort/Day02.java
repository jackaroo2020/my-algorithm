package sort;
/**
 * @description  描述: 选择排序
 *
 * 基本思想：
 * 简单选择排序是最简单直观的一种算法，每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止，简单选择排序是不稳定排序。
 * 在算法实现时，每一轮确定最小元素的时候会通过不断地比较交换来使得首位置为当前最小，交换是个比较耗时的操作。
 * 因此可以通过设置一个变量min，每一次比较出存储较小元素，并且记录当前元素的数组下标，当本轮循环结束之后，那这个变量min存储的就是当前最小元素的下标，
 * 此时再执行交换操作,以此确定本轮遍历的最小元素放到了数组前部。
 *
 * 算法分析：
 * 简单选择排序通过上面优化之后，无论数组原始排列如何，比较次数是不变的；对于交换操作，在最好情况下也就是数组完全有序的时候，无需任何交换移动，在最差情况下，
 * 也就是数组倒序的时候，交换次数为n-1次。综合下来，时间复杂度为O(n2)
 *
 * @author  LT
 * @date  2020/7/21
 */
public class Day02 {

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            if (index != i) {
                swap2(arr,i,index);
            }
        }
    }

    /**
     * 元素交换方式3
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap1(int[] arr, int a, int b) {
      arr[a] ^= arr[b];
      arr[b] ^= arr[a];
      arr[a] ^= arr[b];
    }

    /**
     * 元素交换方式2
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap2(int[] arr, int a, int b) {
       arr[a] = arr[a] + arr[b];
       arr[b] = arr[a] - arr[b];
       arr[a] = arr[a] - arr[b];
    }


    /**
     * 元素交换方式1
     *
     * @param arr
     * @param i
     * @param index
     */
    public static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sortArray = {1,4,2,67,12};
        print(sortArray);
        selectSort(sortArray);
        print(sortArray);
    }
}
