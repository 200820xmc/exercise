package code1;
import java.util.Scanner;
public class pingfanggen {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i = 1 ; i <= num; i++) {
            if (i * i == num){
                System.out.println(i+"是"+num+"的平方根");
                break;
            }
            else if (i * i > num){
                System.out.println(i-1 +"是"+num+"平方根的整数部分");
                break;
            }
        }

    }
}
