package code1;

import java.util.Scanner;
public class huiwenshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数：");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            sum = sum * 10 + a;
        }
        System.out.println(sum);
        if(sum == temp){
            System.out.println("是回文数");
        }
        else{
            System.out.println("不是回文数");
            }
    }
}
