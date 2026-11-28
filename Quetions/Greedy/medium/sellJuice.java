package Quetions.Greedy.medium;

public class sellJuice {
    // t.c-> O(n), s.c->O(1)
    private static boolean check(int[] arr) {
        int five = 0;
        int tens = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                five += 1;
            } else if (arr[i] == 10) {
                tens += 1;
                if (five > 0) {
                    five -= 1;
                } else {
                    return false;
                }
            } else {
                if (tens > 0 & five > 0) {
                    tens -= 1;
                    five -= 1;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 5, 10, 10, 20 };
        System.out.println(sellJuice.check(arr));
    }
}
