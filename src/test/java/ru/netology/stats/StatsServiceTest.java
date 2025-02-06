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

    public void salesamount() { //Общая сумма продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long Expectedamount = 180;
        long actualday = service.salesamount(sales);

        Assertions.assertEquals(actualday, Expectedamount);
    }

    @Test

    public void averageamount() { //Средняя сумма продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long Expectedamount = 15;
        long actualday = service.averageamount(sales);

        Assertions.assertEquals(actualday, Expectedamount);

    }

    @Test

    public void belowaveragesales() { //Ниже средних продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long ExpectedMonth = 7;
        long actualday = service.belowaveragesales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }

    @Test
    public void aboveaveragesales() { //Выше средних продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long ExpectedMonth = 5;
        long actualday = service.aboveaveragesales(sales);

        Assertions.assertEquals(actualday, ExpectedMonth);
    }
}