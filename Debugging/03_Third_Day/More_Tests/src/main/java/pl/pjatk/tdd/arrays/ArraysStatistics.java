package pl.pjatk.tdd.arrays;

import static java.lang.Math.floor;

public class ArraysStatistics {
    public static int max(int[] numbers){
        int max_number = numbers[0];
        for (int x : numbers) {
            if (x > max_number) {
                max_number = x;
            }
        }
        return max_number;
    }

    public static int min(int[] numbers){
        int max_number = numbers[0];
        for (int x : numbers) {
            if (x < max_number) {
                max_number = x;
            }
        }
        return max_number;
    }

    public static double avg(int[] numbers){
        int suma = sum(numbers);
        int len = 0;
        for (int x: numbers) {
            len++;
        }
        double answer = suma / len;
        return answer;
    }

    public static int sum(int[] numbers){
        int suma = 0;
        for (int x: numbers) {
            suma += x;
        }
        return suma;
    }
}
