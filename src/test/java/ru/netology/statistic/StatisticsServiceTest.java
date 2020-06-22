package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMaxFromFathersIncome() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void findMaxFromMothersIncome() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {3, 14, 11, 5, 8, 4, 13, 9, 6};
    long expected = 14;
    long actual =  service.findMax(incomesInBillions);

    assertEquals(expected,actual);
  }
}