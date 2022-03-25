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
        return sumAllSales(allSales) / allSales.length;
    }

    public int peakSales(int[] allSales) {
        int maxMonth = 0;
        int month = 0;
        for (long allSale : allSales) {
            if (allSale >= allSales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int declineSales(int[] allSales) {
        int minMonth = 0;
        int month = 0;
        for (long allSale : allSales) {
            if (allSale <= allSales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] allSales) {
        int lessThanAverage = 0;
        float average = averageSumSales(allSales);
        for (int allSale : allSales) {
            if (allSale < average) {
                lessThanAverage++;
            }
        }
        return lessThanAverage;
    }

    public int aboveAverage(int[] allSales) {
        int moreThanAverage = 0;
        float average = averageSumSales(allSales);
        for (int allSale : allSales) {
            if (allSale > average) {
                moreThanAverage++;
            }
        }
        return moreThanAverage;
    }
}


