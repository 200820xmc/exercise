public class Main {
    public static int[] solution(int n, int max, int[] array) {
        // Count frequency of each card value (1-13)
        int[] count = new int[14];
        for (int card : array) {
            count[card]++;
        }

        // Card value ranking: 1 (A) > K (13) > Q (12) > J (11) > 10 > 9 > ... > 2
        int[] rankOrder = {1, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        // Try all combinations in order of priority (best a first, then best b)
        for (int a : rankOrder) {
            if (count[a] >= 3) {
                for (int b : rankOrder) {
                    if (b != a && count[b] >= 2) {
                        int sum = 3 * a + 2 * b;
                        if (sum <= max) {
                            return new int[]{a, b};
                        }
                    }
                }
            }
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        // Add your test cases here

        System.out.println(java.util.Arrays.equals(solution(9, 34, new int[]{6, 6, 6, 8, 8, 8, 5, 5, 1}), new int[]{8, 5}));
        System.out.println(java.util.Arrays.equals(solution(9, 37, new int[]{9, 9, 9, 9, 6, 6, 6, 6, 13}), new int[]{6, 9}));
        System.out.println(java.util.Arrays.equals(solution(9, 40, new int[]{1, 11, 13, 12, 7, 8, 11, 5, 6}), new int[]{0, 0}));
    }
}
