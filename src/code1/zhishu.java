package code1;
import java.util.Scanner;
public class zhishu {

    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean falg = true;

        for (int i = 2;i < n ;i++){
            if(n % i == 0){
                falg = false;
                break;
            }
        }
        if(falg) {
            System.out.println(n + "是质数");
        }else{
            System.out.println(n + "不是质数");
        }
    }
}
