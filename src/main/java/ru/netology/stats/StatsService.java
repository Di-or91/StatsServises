package ru.netology.stats;

public class StatsService {
    public int sum(long[] sales) {
        int sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        long averageSales = sumSales / sales.length;
        return averageSales;
    }

    public long monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;

    }

    public int SalesBelowAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                result++;
            }
        }
        return result;
    }

    public int SalesAboveAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                result++;
            }
        }
        return result;
    }
}