import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    // tc -> sabse ghatiya approache
    public static boolean checkIntersection(int value, int[] targetArray) {
        for (int num : targetArray) {
            if (num == value) {
                return true; // Found a match
            }
        }
        return false;
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        int arr1length = arr1.length;
        int arr2length = arr2.length;
        int[] samllerArray = (arr1length < arr2length) ? arr1 : arr2;
        int[] largerArray = (arr1.length < arr2.length) ? arr2 : arr1;
        ArrayList<Integer> resultantArray = new ArrayList<>();
        for (int i = 0; i < samllerArray.length - 1; i++) {
            int currentElement = samllerArray[i];
            if (checkIntersection(currentElement, largerArray)) {
                if (!resultantArray.contains(currentElement)) {
                    resultantArray.add(currentElement);
                }
            }
        }
        int[] result = new int[resultantArray.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultantArray.get(i);
        }
        return result;
    }

    public static int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
        int[] output = new int[set1.size()];
        int idx = 0;
        for (Integer s : set1) {
            if (set2.contains(s)) {
                output[idx++] = s;
            }
        }
        return Arrays.copyOf(output, idx);
    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) {
            set1.add(n);
        }
        Set<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) {
            set2.add(n);
        }
        if (set1.size() < set2.size()) {
            return Sort(setIntersection(set1, set2));
        } else {
            return Sort(setIntersection(set2, set1));
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 5 };
        int[] arr2 = { 1, 2, 7 };
        System.out.println(Arrays.toString(ArrayIntersection.intersection(arr1, arr2)));
        System.out.println(Arrays.toString(ArrayIntersection.intersection1(arr1, arr2)));
    }

    public static int[] Sort(int[] arr) {
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
        return arr;
    }

}