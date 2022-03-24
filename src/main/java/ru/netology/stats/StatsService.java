package ru.netology.stats;

public class StatsService {
    int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int sumSales = 0;

    public int sumAllSales(int[] allSales) {
        for (int allSale : allSales) {
            sumSales += allSale;
        }
        return sumSales;
    }

    public int averageSumSales(int[] allSales) {
        int averageSum = 0;
    }


}


