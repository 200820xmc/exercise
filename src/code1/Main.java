package code1;
/**
 * 抽象动物类
 * 这是一个抽象类，用于表示动物的基本特性
 */
abstract class Animal {
    /**
     * 抽象方法，用于发出声音
     * 具体的动物子类需要实现这个方法来定义自己的叫声
     */
    abstract void makeSound();

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}
public class Main {
/**
 * 主方法，程序的入口点
 * 演示了多态的使用
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个Dog对象，并将其赋值给Animal类型的引用变量，体现多态特性
        Animal animal = new Dog(); // 多态
    // 调用makeSound()方法，由于多态，实际执行的是Dog类中的makeSound()方法
        animal.makeSound();
    // 调用sleep()方法，由于多态，实际执行的是Dog类中的sleep()方法
        animal.sleep();
    }
}