package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
    CashbackHackService service = new CashbackHackService();
    int amount =1000;
    int actual = service.remain( amount);
    int expected = 0;
    assertEquals(expected,actual);


    }

    @Test
    public void testRemainWhitCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000 ;
        int acctual =service.remain(amount);
        int expected =100;
        assertEquals(expected,acctual);

    }

}