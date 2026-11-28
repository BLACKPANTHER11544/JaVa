package Quetions.Greedy.medium;

import java.util.Arrays;

public class AssignCookies {
    // t.c-> O(min(student.length, cookies.length)), s.c -> O(1);
    public static int find(int[] student, int[] cookies) {
        Arrays.sort(student);
        Arrays.sort(cookies);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < student.length && j < cookies.length) {
            if (cookies[j] >= student[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int Student[] = { 1, 2 };
        int Cookies[] = { 1, 2, 3 };
        System.out.println(AssignCookies.find(Student, Cookies));
    }
}
