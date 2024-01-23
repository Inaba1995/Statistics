package ru.netology.stats;

public class StatsService {
    int getSum(int[] stats) {
        int s = 0;
        for (int curr : stats)
            s += curr;

        return s;
    }

    double getAvg(int[] stats) {
        double s = 0;
        for (int curr : stats)
            s += curr;

        return s / stats.length;
    }

    int getLastMaxMonth(int[] stats) {
        int max = 0;
        for (int i = 1; i < stats.length; ++i)
            if (stats[i] >= stats[max])
                max = i;

        return max + 1;
    }

    int getLastMinMonth(int[] stats) {
        int min = 0;
        for (int i = 1; i < stats.length; ++i)
            if (stats[i] <= stats[min])
                min = i;

        return min + 1;
    }

    int getCountBelowAvg(int[] stats) {
        double s = 0;
        for (int curr : stats)
            s += curr;

        double avg = s / stats.length;

        int count = 0;
        for (int curr : stats)
            if (curr < avg)
                ++count;

        return count;
    }

    int getCountAboveAvg(int[] stats) {
        double s = 0;
        for (int curr : stats)
            s += curr;

        double avg = s / stats.length;

        int count = 0;
        for (int curr : stats)
            if (curr > avg)
                ++count;

        return count;
    }

}
