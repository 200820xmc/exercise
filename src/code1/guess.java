package code1;
import java.util.Random;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int guessNumber = sc.nextInt();
        while ( guessNumber != secretNumber) {
            attempts++;
            if (guessNumber < secretNumber) {
                System.out.println("Too low!");
            } else if (guessNumber > secretNumber) {
                System.out.println("Too high!");
            }
            System.out.println("请重新输入数字：");
            guessNumber = sc.nextInt();
        }
        System.out.println("恭喜你猜对了！你猜了" + attempts + "次。");
    }
}
