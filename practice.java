import java.util.Arrays;

public class practice {
    public static void Bubble(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - 1 - i;
            int get_max_index = getElement(arr, 0, last_index);
            swap(arr, get_max_index, last_index);
        }
        System.out.print(Arrays.toString(arr));
    }

    public static int getElement(int[] arr, int start, int last) {
        int max_value = start;
        for (int i = start; i < last; i++) {
            if (arr[i] > arr[max_value]) {
                max_value = i;
            }
        }
        return max_value;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 4, 0 };
        practice.Bubble(arr);
        System.err.println();
        practice.Selection(arr);
        System.out.println();
        practice.Insertion(arr);
    }
}
