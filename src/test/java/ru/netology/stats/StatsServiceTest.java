package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumAllSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumAllSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSumSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSumSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBestSalesMonth() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.peakSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldWorstSalesMonth() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.declineSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowAverage() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverage(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveAverage() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveAverage(allSales);
        assertEquals(expected, actual);
    }
}