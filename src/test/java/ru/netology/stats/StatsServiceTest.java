package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void minSales() { // Минимальный месяц продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long ExpectedMonth = 9;
        long actualday = service.minSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test

    public void maxSales() { //Максимальный месяц продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long ExpectedMonth = 8;
        long actualday = service.maxSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test

    public void salesAmount() { //Общая сумма продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long Expectedamount = 180;
        long actualday = service.salesAmount(sales);

        Assertions.assertEquals(actualday, Expectedamount);
    }

    @Test

    public void averageAmount() { //Средняя сумма продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long Expectedamount = 15;
        long actualday = service.averageAmount(sales);

        Assertions.assertEquals(actualday, Expectedamount);

    }

    @Test

    public void belowAverageSales() { //Ниже средних продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long ExpectedMonth = 7;
        long actualday = service.belowAverageSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test
    public void aboveAverageSales() { //Выше средних продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long ExpectedMonth = 5;
        long actualday = service.aboveAverageSales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }
}