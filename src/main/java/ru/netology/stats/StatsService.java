package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; //номер месяца с максимальной продажой

        for (int t = 0; t < sales.length; t++) {
            if (sales[t] >= sales[maxMonth]) {
                maxMonth = t;
            }
        }
        return maxMonth + 1;
    }

    public long salesAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long averageAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        if (sales.length == 0) {
            return 0;
        }
        return amount / sales.length;
    }

    public int belowAverageSales(long[] sales) {
        long averge = averageAmount(sales);
      int count = 0;

        for (long sale : sales) {
            if (sale <= averge) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        long averge = averageAmount(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > averge) {
                count++;
            }
        }
        return count;
    }
}


