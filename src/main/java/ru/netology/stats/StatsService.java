package ru.netology.stats;

public class StatsService {
    long getSum(long[] stats) {
        long sum = 0;
        for (long curr : stats) {
            sum += curr;
        }

        return sum;
    }

    double getAvg(long[] stats) {
        return (double) getSum(stats) / stats.length;
    }

    int getLastMaxMonth(long[] stats) {
        int max = 0;
        for (int i = 1; i < stats.length; ++i) {
            if (stats[i] >= stats[max]) {
                max = i;
            }
        }

        return max + 1;
    }

    int getLastMinMonth(long[] stats) {
        int min = 0;
        for (int i = 1; i < stats.length; ++i) {
            if (stats[i] <= stats[min]) {
                min = i;
            }
        }

        return min + 1;
    }

    int getCountBelowAvg(long[] stats) {
        double average = getAvg(stats);

        int count = 0;
        for (long curr : stats) {
            if (curr < average) {
                ++count;
            }
        }

        return count;
    }

    int getCountAboveAvg(long[] stats) {
        double average = getAvg(stats);

        int count = 0;
        for (long curr : stats) {
            if (curr > average) {
                ++count;
            }
        }

        return count;
    }
}
