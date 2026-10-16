package Quetions.BinarySearch.medium;

public class CapacityToShipPacakgesWithinDDays {
    // t.c -> O(n*SumOfArrayElement - MaxElement), s.c -> O(1);
    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = Integer.MIN_VALUE;
        int SumWeigth = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            SumWeigth += weight;
        }

        for (int i = maxWeight; i <= SumWeigth; i++) {
            if (requiredDays(weights, i) <= days) {
                return i;
            }
        }
        return -1;
    }

    public static int requiredDays(int[] weights, int capacity) {
        int load = 0;
        int days = 1;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    // t.c -> O(n*log(SumWeight - maElement)) , s.c -> O(1)
    public static int shipWithinDays1(int[] weights, int days) {
        int maxElement = Integer.MIN_VALUE;
        int SumWeigth = 0;
        for (int weight : weights) {
            maxElement = Math.max(maxElement, weight);
            SumWeigth += weight;
        }
        int start = maxElement;
        int end = SumWeigth;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (requiredDays(weights, mid) <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 4, 1, 4 };
        int days = 3;
        System.out.println(CapacityToShipPacakgesWithinDDays.shipWithinDays1(arr, days));
    }
}