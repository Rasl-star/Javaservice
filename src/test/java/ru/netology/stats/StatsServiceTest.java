package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test

    public void minSales() {// Минимальный месяц продаж

        int ExpectedMonth = 9;
        long actualday = service.minSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test

    public void maxSales() { //Максимальный месяц продаж

        int ExpectedMonth = 8;
        long actualday = service.maxSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test

    public void salesAmount() { //Общая сумма продаж

        int Expectedamount = 180;
        long actualday = service.salesAmount(sales);

        Assertions.assertEquals(actualday, Expectedamount);
    }

    @Test

    public void averageAmount() { //Средняя сумма продаж

        int Expectedamount = 15;
        long actualday = service.averageAmount(sales);

        Assertions.assertEquals(actualday, Expectedamount);

    }

    @Test

    public void belowAverageSales() { //Ниже средних продаж

        int ExpectedMonth = 7;
        long actualday = service.belowAverageSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test
    public void aboveAverageSales() { //Выше средних продаж

        int ExpectedMonth = 5;
        long actualday = service.aboveAverageSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }
}