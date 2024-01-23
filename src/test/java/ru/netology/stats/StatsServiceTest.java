package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedSum = 180;
        int actualSum = service.getSum(stats);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldCalculateAvg() {
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        double expectedAvg = 15;
        double actualAvg = service.getAvg(stats);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    void shouldCalculateLastMaxMonth() {
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedMonth = 8;
        int actualMonth = service.getLastMaxMonth(stats);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void shouldCalculateLastMinMonth() {
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedMonth = 9;
        int actualMonth = service.getLastMinMonth(stats);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void shouldCalculateCountBelowAvg() {
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedCount = 5;
        int actualCount = service.getCountBelowAvg(stats);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    void shouldCalculateCountAboveAvg() {
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedCount = 5;
        int actualCount = service.getCountAboveAvg(stats);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}
