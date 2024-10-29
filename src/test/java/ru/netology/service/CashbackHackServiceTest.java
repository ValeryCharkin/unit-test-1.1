package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
    CashbackHackService service = new CashbackHackService();
    int amount =1000;
    int actual = service.remain( amount);
    int expected = 0;
    assertEquals(actual,expected);


    }

    @Test
    public void testRemainWhitCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 850;
        int acctual =service.remain(amount);
        int expected =100;
        assertEquals(acctual,expected);

    }

}