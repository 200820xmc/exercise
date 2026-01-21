package code1;

public class feng_7 {

    // 规则判断：是否需要跳过
    public static boolean shouldSkip(int i) {
        return i % 7 == 0 || String.valueOf(i).contains("7");
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (shouldSkip(i)) {
                continue;   // ✅ 现在在循环里了
            }

            System.out.println(i);
        }
    }
}

