package code1;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入女婿的酒量：");
            int wine = sc.nextInt();
            if (wine > 2 ){
                System.out.println("女婿牛逼！！！！！");
            }else{
                System.out.println("你也配娶我女儿l" +"？？？？");
            }
        }
    }
}
