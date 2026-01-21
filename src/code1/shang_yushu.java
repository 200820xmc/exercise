package code1;
import java.util.Scanner;
public class shang_yushu {
    public static void main(String[] args) {
        System.out.println("请输入被除数:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入除数:");
        int b = sc.nextInt();
        int i = 0;
        while (a >= b){
            a = a - b;
            i++;
        }
        System.out.println("商为:"+i+"余数为:"+a);
    }
}
