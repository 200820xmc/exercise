package code2;

import java.util.Scanner;
//有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
// 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
public class task1 {
    public static void main(String[] args) {
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[arr.length+1];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int index = 0;
        while (index < arr.length && num > arr[index]){
            index++;
        }
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

// 2. 插入新元素
        brr[index] = num;

// 3. 插入点之后（整体右移一位）
        for (int i = index; i < arr.length; i++) {
            brr[i + 1] = arr[i];
        }


        for (int i = 0; i < brr.length; i++) {
        System.out.print(brr[i]+" ");
        }
    }
}