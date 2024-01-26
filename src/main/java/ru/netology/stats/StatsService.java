package ru.netology.stats;

public class StatsService {
    int getSum(int[] stats) {
        int sum = 0;
        for (int curr : stats) {
            sum += curr;
        }

        return sum;
    }

    double getAvg(int[] stats) {
        return (double) getSum(stats) / stats.length;
    }

    int getLastMaxMonth(int[] stats) {
        int max = 0;
        for (int i = 1; i < stats.length; ++i) {
            if (stats[i] >= stats[max]) {
                max = i;
            }
        }

        return max + 1;
    }

    int getLastMinMonth(int[] stats) {
        int min = 0;
        for (int i = 1; i < stats.length; ++i) {
            if (stats[i] <= stats[min]) {
                min = i;
            }
        }

        return min + 1;
    }

    int getCountBelowAvg(int[] stats) {
        double average = getAvg(stats);

        int count = 0;
        for (int curr : stats) {
            if (curr < average) {
                ++count;
            }
        }

        return count;
    }

    int getCountAboveAvg(int[] stats) {
        double average = getAvg(stats);

        int count = 0;
        for (int curr : stats) {
            if (curr > average) {
                ++count;
            }
        }

        return count;
    }
}
